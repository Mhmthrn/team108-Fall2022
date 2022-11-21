package day06_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    /*
   Soru 1-
    Kullanicidan cinsiyetini ve yasini alin,
    Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
    Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
    “Emekli olmak icin.. Yil daha calisman gerekir” yazdirin.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Cinsiyetinizi giriniz\nK : Kadin, E : Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen Yasinizi giriniz");
        double yas = scan.nextDouble();


        if (cinsiyet == 'K' || cinsiyet == 'k') {// kadinlar bolumu
            if (yas < 18 || yas > 80) System.out.println("Gecersiz yas");
            else if (yas >= 60) System.out.println("Emekli olabilirsiniz");
            else System.out.println("emekli olam icin" + (60 - yas) + " yil daha calimalisiniz");

        } else if (cinsiyet == 'E' || cinsiyet == 'e') {//erkekler bolumu

            if (yas < 18 || yas > 80) System.out.println("Gecersiz yas");
            else if (yas >= 65) System.out.println("Emekli olabilirsiniz");
            else System.out.println("emekli olam icin" + (65 - yas) + " yil daha calimalisiniz");


        } else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}


