package day13_methodOverlloding_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    /*
    kullanicidan toplmamk uzere sayi alin girilen sayilaarin toplami 500 olur veya gecerse bu dadar sayi yeter
    deyip toplami yazdirin
     */
    public static void main(String[] args) {

        // bu soruyu illa for loop la yapalim dersek adim sayisini tahmin edip yapabiliriz
        Scanner scan =new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i =1; i <10000 ; i++) {
            System.out.println("Toplamak istediginiz tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;

            if (toplam>=500){
                System.out.println("Bu kadar sayi yeter.Toplamri  :"+ toplam);
                break;
            }


        }
        // while loop ile
        toplam=0;
        sayi=0;
        while (toplam<500){
            System.out.println("Toplamak istediginiz tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;


        }
        System.out.println("Bu kadar sayi yeter.Toplamri  :"+ toplam+" oldu");

    }
}
