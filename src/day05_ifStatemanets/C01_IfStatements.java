package day05_ifStatemanets;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        ogrenciden notunu rakam olarak alin harf olarak ;yazdirin

        0- 49,999   DD
        50- 649,999 CC
        65- 84,999  BB
        85- 100 AA


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (0<=not && not<50){
            System.out.println("Notunuz DD, malesef kaldiniz");
        }

        if (50<=not && not<65){
            System.out.println("Notunuz CC, tebrikler gectiniz");
        }

        if (not>=65 && not<85){
            System.out.println("Notunuz BB");
        }
        if (85<=not && not<=100){
            System.out.println("Tebrikler notunuz AA");
        }
    }
}
