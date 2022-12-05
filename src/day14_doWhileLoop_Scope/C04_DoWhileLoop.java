package day14_doWhileLoop_Scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */

        int input =16;
        int baslangic=1;
        boolean sonuc=false;



        while (baslangic*baslangic<=input){
            if (baslangic*baslangic==input){
                System.out.println("Girilen sayinin karekoku :"+ baslangic);
                sonuc=true;
                break;
            }else {
                baslangic++;
            }
        }
        System.out.println(sonuc);


        // do while loop

         input =144;
         baslangic=1;
         sonuc=false;

        do {
            if (baslangic*baslangic==input){
                System.out.println("Girilen sayinin karekoku :"+ baslangic);
                sonuc=true;
                break;
            }else {
                baslangic++;
            }

        }while (baslangic*baslangic <= input);
        System.out.println(sonuc);



    }
}
