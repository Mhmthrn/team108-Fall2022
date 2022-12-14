package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
        Eger coklu element iceren bir yapidaki tum elementlere ayni islemi yapmak istiyorsak
        indexten bagimsiz olarak for each loop kullanilabilir
        for  each loopt a3 seyi belirtmemiz gerekir
        1- getirilecek elemenlerinin data turu
        2- getirilen elemente verilecek isim (genelde each/ w kullanilir)
        3- nereden getirilecegi -kaynak
         */
        int []arr={2,4,6,8,1};
        // bu array'in tum elementlerini yazdiralim

        for(int each:arr){

            System.out.print(each+ " ");

        }
        System.out.println();

        // tum elementleri toplayalim
        int toplam=0;
        for(int each:arr){
            toplam+=each;
        }
        System.out.println("Sayilarin Toplami : "+ toplam);

        // tum sayilarin karelerini toplayalim

        toplam=0;
        for (int each:arr){
            toplam+=each*each;
        }
        System.out.println("Sayilarin kareleri toplami : "+toplam);



    }
}
