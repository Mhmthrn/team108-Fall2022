package day08_stringManipulations;

public class C07_subString {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length());//19

        // metnin tma ortasindaki karakter nedir
        System.out.println(str.charAt(str.length() / 2));// n

        // son karakteri yazdirin
        System.out.println(str.length()-1);// p

        // bir karakteri degil de vrilen Stringin icerdigi bir metin parcassini
        // elde etmek istersek
        // orengin "ogren" kelimesini yazdiralim.

        System.out.println(str.substring(5, 10));// ogren

        /*
        subString methodun da  baslangic dahil bitis haric olarak kabul edilir
        method kullanilirken bu n adikkat edilmeleidir
         */

        // "Java" kelimesini yazdiralim
        System.out.println(str.substring(0,4));// Java

        //" kap" yazdiralim
        System.out.println(str.substring(str.length() - 3));// kap

        // subString kullanarak sadece J Harfini yazdirin

        System.out.println(str.substring(0, 1));// J

        // subStrin kullanrak 9. indexteki harfi buyuk olarak yazdirin

        System.out.println(str.substring(9, 10).toUpperCase());// N

        System.out.println(str.substring(5, 5));// hiclik yazdirir

       // System.out.println(str.substring(4, 3));// StringIndexOutOfBoundsException

       // System.out.println(str.substring(25, 28));//StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));// hiclik yazdirir
        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
       // System.out.println(str.substring(str.length() + 1));//StringIndexOutOfBoundsException
        System.out.println("-=-=-=-=-=-=-=-==-=-");


    }
}
