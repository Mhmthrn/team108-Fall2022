package day08_stringManipulations;

public class C03_equals {
    public static void main(String[] args) {

        String str1="Java";

        String str2= "Java";

        String str3= new String("Java");

        String str4= "Ja";

        String str5= str4.concat("va");

        System.out.println(str1==str2);// true

        System.out.println(str1==str3);// false

        System.out.println(str1==str5);// false

        /*
        == string icin bekledigimiz sonuclari vermeyebilir
                  hem metnin degerini hemde objenin referansini karsilastirir
             Java da String objelerin ayni olup olmasigini kontrol etmek icin equals methodu kullanilmalidir.
         */
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str5));// true



    }
}
