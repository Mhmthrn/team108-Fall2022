package day10_stringManipulation;

public class C11_ForLopp {
    public static void main(String[] args) {
        /*
        verilen sayinin faktoriyelini hesaplayin
         */

        int input=6;
        int faktoriyel=1;

        for (int i =input ; i >=1 ; i--) {
            faktoriyel*=i;

        }
        System.out.println("verilen  "+ input+"! sayi degeri :"+ faktoriyel+ " dir");
    }
}
