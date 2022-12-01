package day13_methodOverlloding_WhileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

        sifre kontolunu bir methodda yapip true false dondurun
        main methodda donen sonucu konrol edip basari ile olusturuldu yazincaya kadar sifreyi
        tekrar tekrak isteyin

         */
        Scanner scan = new Scanner(System.in);

        boolean tekrakSifreIste = true;
        String sifre = "";


        while (tekrakSifreIste) {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            if (sifreKontrolEt(sifre)) {// sifre kontrolu true donerse sifre basrili demektir
                System.out.println("Sifre basari ile olusturuldu");

                //break;
                tekrakSifreIste = false;// bre

            }


        }
    }

        public static boolean sifreKontrolEt(String sifre) {

            int flag = 0;


            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("ilk harf kücük olmali");
                flag++;
            }

            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("Son harf karakter olmali");
                flag++;
            }

            // sifre.charAt(sifre.length()-1)        // sifre.charAt(10) ---> son harf
            // sifre.charAt (  sifre.length()-1 == son harf    )

            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
                flag++;
            }

            if (!(sifre.length() >= 10)) {
                System.out.println("Uzunlugu en az 10 karakter olmalidir");
                flag++;
            }

            if (flag == 0) {
                return true;
            } else {
                return false;
            }

        }


    }

