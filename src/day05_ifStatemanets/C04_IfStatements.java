package day05_ifStatemanets;

import java.util.Scanner;

public class C04_IfStatements {
    /*
    Soru 3- Kullanicidan bir sayi alin,
    sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
    5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0) System.out.println("3 ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("5 ile bolunebilen sayi");


    }


}
