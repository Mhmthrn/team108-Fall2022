package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin, ve sayinin karesini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karesini almak istediginz  bir  sayi giriniz");
        double girilenSayi= scan.nextDouble();
        System.out.println("Girilen Sayinin karesi :"+(girilenSayi*girilenSayi));
    }
}
