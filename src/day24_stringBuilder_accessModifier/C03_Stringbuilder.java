package day24_stringBuilder_accessModifier;

public class C03_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";
        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));// false
        // Stringbuilder metin esitligini sorgulamak icin equals() kullanmaz
        System.out.println(sb1.compareTo(sb2));// 0

        StringBuilder sb3=new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3));// 2

        sb3=new StringBuilder("Tava");
        System.out.println(sb1.compareTo(sb3));//-10

        sb3=new StringBuilder("Jaka");
        System.out.println(sb1.compareTo(sb3));//11

        sb3=new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3));//-1

        sb3=new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3));//-7

        //System.out.println(sb1==str); data turleri farkli CTE verir.

        System.out.println(sb1.equals(str));// false

        //System.out.println(sb1.compareTo(str)); comparato() stringBuilderlar arasinda calisir






    }
}
