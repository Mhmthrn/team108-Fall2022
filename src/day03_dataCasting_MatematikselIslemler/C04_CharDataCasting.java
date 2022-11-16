package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /*
        char data turunun ekstra bir ozelligi var
        eger matematiksel islemde Char data turunden bir deger kullanirsak.
        Java o charin ascii degerini goz onunde bulundurraark o islemi gerceklestiri.

         */
        System.out.println('a'+'b');// 97+98=195
        System.out.println('a'-32);// 65

        // 'a'-32 nin char olarak sonic vermesini istersek
        System.out.println((char) ('a'-32));// A

        // kullanicidan bir char alip
        // ascii table dan kullanicinin girdigi charin sonraasindaki 3 krk yi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir char degeri  giriniz");

        char girilenDeger=scan.next().charAt(0);

        System.out.println((char) (girilenDeger+1) +","+
                            (char) (girilenDeger+2) +","+
                            (char) (girilenDeger+3) );


    }
}
