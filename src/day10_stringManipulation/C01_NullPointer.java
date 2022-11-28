package day10_stringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        String str2="    ";
        String str3;
        String str4=null;

        System.out.println(str1.length());// 0
        System.out.println(str2.length());// 4
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());// false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // null bir deger  degil isaretcidir (null pointer)
        // null pointer ': non primitiv bir objenin olsturuldugunu
                        // ancak bilincli olarak deger atamadigini isaretler.
        // str4 in degeri null dir cumlesi yanlis
        // str4 null olarak isaretlenmistir cumlesi dogrudur

       //System.out.println(str3.length());
       //System.out.println(str3.concat("Ali Can"));
        //System.out.println(str3.substring(3,4));
        /*
        java bir variableyi olusturup deger atanmamamasina izin verir
        bir variableyi deger atamadan olusturabiliriz ancak kullanamayiz
        deger atanmayan bir variable yi kullanmaya kalkarsak
        java CTE verir.



         */
        str4=null;
        //System.out.println(str4.length());//NullPointerException
       // System.out.println(str4.substring(3, 4));//NullPointerException
        System.out.println(str4);// null
        System.out.println(str4 + "Ali can");// nullAli can
        System.out.println(str4.concat("Ali Can"));// NullPointerException


    }
}
