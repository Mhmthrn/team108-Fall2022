package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TrayCatch {
    /*
    Kullanicidan toplamak uzere sayilar alin
    kullancidan islemi bitirmesi icin q ya bamasini soyleyin
    kullnici q ya bastiginda toplam kac sayi girdigini ve toplami yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int toplam=0;

        while (sayiAdedi<10000){
            try {

                System.out.println("Toplamak icin tamsayi giriniz\n" +
                        "Bitirmek icin Q ya basin");
                girilenSayi=scan.nextInt();

                toplam+=girilenSayi;
                sayiAdedi++;

            }
         catch (InputMismatchException e) {
             String girilenDeger = scan.nextLine();
             if (girilenDeger.equalsIgnoreCase("q")) {
                 System.out.println("Girilen " + sayiAdedi + " sayinin Toplami : " + toplam);
                 break;

             } else {
                 System.out.println("Gecersiz input girisi");
             }
         }

        }


    }
}
