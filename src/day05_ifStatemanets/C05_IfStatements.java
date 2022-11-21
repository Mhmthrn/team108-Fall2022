package day05_ifStatemanets;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='o' || harf=='O') System.out.println("Ocak");
        if (harf=='s' || harf=='S') System.out.println("Subat");
        if (harf=='m' || harf=='M') System.out.println("Mart veya Mayis");
        if (harf=='n' || harf=='N') System.out.println("Nisan");
        if (harf=='h' || harf=='H') System.out.println("Haziran");
        if (harf=='t' || harf=='T') System.out.println("Temmuz");
        if (harf=='a' || harf=='A') System.out.println("Aralik, Agustos");
        if (harf=='e' || harf=='E') System.out.println("Eylul veya Ekim");
        if (harf=='k' || harf=='K') System.out.println("Kasim");




    }
}
