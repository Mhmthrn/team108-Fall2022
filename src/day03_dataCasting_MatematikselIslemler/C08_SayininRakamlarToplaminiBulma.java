package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        /*kullnicidan 4 basamakli pozitif bir sayi alin
        sayinin rakamlar toplamini yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int girilenSayi=scan.nextInt();

        int birlerBasamagi=0;
        int rakamlartoplami=0;

        birlerBasamagi=girilenSayi%10;
        rakamlartoplami+=birlerBasamagi;
        girilenSayi/=10;

        birlerBasamagi=girilenSayi%10;
        rakamlartoplami+=birlerBasamagi;
        girilenSayi/=10;

        birlerBasamagi=girilenSayi%10;
        rakamlartoplami+=birlerBasamagi;
        girilenSayi/=10;

        birlerBasamagi=girilenSayi%10;
        rakamlartoplami+=birlerBasamagi;
        girilenSayi/=10;

        System.out.println("Girilen sayinin rakamlar toplami :"+rakamlartoplami);


    }
}
