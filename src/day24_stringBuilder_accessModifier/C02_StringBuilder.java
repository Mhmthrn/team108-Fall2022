package day24_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.capacity());//20
        System.out.println(sb.length());//4

        sb.trimToSize();
        // atama yapmadigimiz halde yapilan degisiklikler kalici olur. StringBuileder mutable oldigindan
        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();
        System.out.println(sb);//Java
        // StringBuilderi stringe cevirirsek string immutable oldugundan yapilan degisiklikler kalici olmaz.

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2);// JAVA
        sb=sb2;
        System.out.println(sb);//JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb);// HAVA

        System.out.println(sb.substring(2, 3));//V

        System.out.println(sb);// HAVA

        System.out.println(sb.reverse());//AVAH
        System.out.println(sb);// AVAH

        sb.insert(1,"H ");
        System.out.println(sb);//AH VAH

        String uzunMetin=" ETMEK YOK CALISMAK VAR";


        sb.insert(6,uzunMetin,0,10);
        System.out.println(sb);//AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3));//4

        System.out.println(sb.indexOf("VAH"));//3

        System.out.println(sb.lastIndexOf("VAH"));//3

        System.out.println(sb.lastIndexOf("E", 9));// 7

        sb.replace(0,12,"Sorun");
        System.out.println(sb);//Sorun YOK

        sb.delete(5,sb.length());
        System.out.println(sb);// Sorun




    }
}
