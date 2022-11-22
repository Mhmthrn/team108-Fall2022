package day07_ternary_SwitchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /*
        kullanicidan bir tam sayi alin sayi
        rakam ise girilen sayi rakam
        sayi iki basamakli ise girilen sayi iki basamakli
        sayi iki basmaktna buyukse buyuk sayi yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi=scan.nextInt();


        if (0<=girilenSayi && girilenSayi<=9) System.out.println("Girilen sayi rakamdir");

        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("Girilen sayi iki basamaklidir");

        else if (girilenSayi>=100) System.out.println("Buyuk sayi");




    }

}
