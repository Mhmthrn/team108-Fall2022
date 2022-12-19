package day22_immutableClasses;

public class C04_StringEquelsMethodu {
    public static void main(String[] args) {
        /*
        Java Stringlerde her seferinde yeni obje olusturmamak icin String havuzu kullanir
         */

        String str1="Java";
        String str2="Java";
        String str3= new String("Java");

        String a="Ja";
        String b="va";
        String str4=a+b;//Java

        String str5=a.concat(b);//Java
        String str6= str5+"";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true
        System.out.println(str1.equals(str5));// true
        System.out.println(str1.equals("Java"));// true

        System.out.println("/=/=/=/=/=/=/=/=/=/=/=");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1=="Java");//true
    }
}
