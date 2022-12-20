package day23_dateTime_Varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        /*
        oyle bir method yazalim ki
        kac tane argument yazarsam yazayim
        argumentlerin toplamini versin

         */
        topla(5,6);
        topla(5,6,2);
        topla(5,6,2,8,6,9,7,4,5,8,7,4,5,6,9,7,4);
        /*
        Varargs array altyapisini kullanir
        Temel hedef argument sayisi degisse bile
        ayni data turundeki tum argumetleri alabilecek
        bir parametre olusturmaktir.
         */
    }

    private static void topla(int ... saylar) {

        int toplam1=0;
        for (int i = 0; i < saylar.length; i++) {
            toplam1+=saylar[i];
        }
        System.out.println(toplam1);

        int toplam2=0;

        System.out.println("/=/=/=/=/=/=/=/-//-/-/-/-/-/-/");

        for (int each: saylar){
            toplam2+=each;
        }
        System.out.println(toplam2);

    }
}
