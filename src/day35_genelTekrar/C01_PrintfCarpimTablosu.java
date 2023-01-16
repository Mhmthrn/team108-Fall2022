package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alin ve carpim toblosu olusturun
         */
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        while (girilenSayi<=1 || girilenSayi>=10) {
            try {
                System.out.println("Carpim tablosu olustumak icin bir rakam giriniz");
                girilenSayi=scan.nextInt();

                if (girilenSayi>1 && girilenSayi<10){
                    break;
               }
                System.out.println("!!!!!!!!!Carpim tablosu icin pozitif bir rakam giriniz.!!!!!!!!!!");
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("!!!!!!!!!Carpim tablosu icin pozitif bir rakam giriniz.!!!!!!!!!!");
            }

        }
        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j =1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%-2d  ",carpim);

            }
            System.out.println(" ");

        }
        /*
        Sinif Sube Isim   Soysisim No
        ============================
        10     H   Ayse    Can 104
        10     K   Sevgi   Can 106
        10     K   Veli    Cem 102
        11     H   Ali     Can 101
        11     K   Ali     Cem 103
        11     M   Sevgi   Cem 105
         */

    }
}
