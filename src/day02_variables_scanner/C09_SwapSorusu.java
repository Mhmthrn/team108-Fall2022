package day02_variables_scanner;

import java.util.Scanner;

public class C09_SwapSorusu {
    /*
    Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi1 i giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen sayi2 i giriniz");
        int sayi2=scan.nextInt();

        int temp;

        temp=sayi2;

        sayi2=sayi1;

        sayi1=temp;

        System.out.println("Sayilarin degerlerinin  degistirilmis hali"+
                "\nsayi1'in yeni degeri   :"+sayi1+
                "\nsayi2'nin yeni degeri  :"+sayi2);


    }


}
