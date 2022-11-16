package day03_dataCasting_MatematikselIslemler;

import com.sun.jdi.ShortType;

import java.awt.*;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java candir";

        // int primitive oldugundan hazir methodlari yoktur.
        // String ise non-primitive oldugu icin hazir methodlara sahiptir.

        /*
        int , char , boolean gibi primitive data turlerinde hazir method kullanmak icin
        Java Integer, Character, Boolean gibi wrapper classlar olusturmustur.

        bunlar primitivler gibi ayni degerleri alir
        ama ekstradan methodlari vardir.
         */
        Integer sayi2=20;
        /*
        islemlerimizi yaparken bazen String olarak tanimlanmis
        ancak matematiksel icerik barindiran variableler ile karsilasabiliriz
        Bu durumda bu tur String variableleri sayiya cevirmek ihtiyacimiz olabilir.
        eger sayiya cevirmek istedigimiz metinlerde harf veya sayi olmayan baska karakter varsa
        Java hata verir.
         */

        String str2="123";
        String str3="354";
        System.out.println(str2 + str3);//123354

        int str2int=Integer.parseInt(str2);//123
        int str3int=Integer.parseInt(str3);//354

        System.out.println(str2int+str3int);// 477

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        System.out.println(Short.MAX_VALUE);// 32767

        char krk1='$';
        System.out.println(Character.isDigit(krk1));// false

        System.out.println(Character.isLetter(krk1));// false

        System.out.println(Character.isAlphabetic(krk1));// false

        short sayi3=4;
        int sayi5=sayi3;

        // Wrapper claslarda casting olmaz

        Short sayi6=45;
        //Integer sayi7=(int)sayi6;



    }
}
