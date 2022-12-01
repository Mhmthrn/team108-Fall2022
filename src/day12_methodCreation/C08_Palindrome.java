package day12_methodCreation;

import java.util.Arrays;

public class C08_Palindrome {
    public static void main(String[] args) {

        /*
        verilen bir Stringin palindrome olup olmadigini yazdirin
         */
        String str="123321";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Verilen metin Palidrome");
        }else {
            System.out.println("Verilen metin Palidrome degil!!");
        }


    }
}
