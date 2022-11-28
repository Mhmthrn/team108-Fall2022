package day10_stringManipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();  // merhaba

        boolean flag=true;

        if (  !(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')   ) {
            System.out.println("ilk harf kücük olmali");
            flag=false;
        }

        if (  !(sifre.charAt(sifre.length()-1) >= '0' && sifre.charAt(sifre.length()-1) <= '9') ) {
            System.out.println("Son harf karakter olmali");
            flag=false;
        }

        // sifre.charAt(sifre.length()-1)        // sifre.charAt(10) ---> son harf
        // sifre.charAt (  sifre.length()-1 == son harf    )

        if (  sifre.contains(" ")  ) {
            System.out.println("Sifre bosluk icermemeli");
            flag=false;
        }

        if (  !(sifre.length() >= 10)  ) {
            System.out.println("Uzunlugu en az 10 karakter olmalidir");
            flag=false;
        }

        // flag false ise if calismistir
        // flag true ise if calismamistir

        if (  flag==true  ) {
            System.out.println("Sifreniz kabul edilmistir");
        } else {
            System.out.println("Sifreniz kabul edilmemistir");
        }


    }

}
