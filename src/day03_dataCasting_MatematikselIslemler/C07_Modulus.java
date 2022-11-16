package day03_dataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        //% isareti Modulus oarak isimlendirilir.
        // Javada bolme islemi donuncuunda kalni verir

        System.out.println(15%4);// 3
        System.out.println(45%4);// 1

        /*
        Kullanicinin girdigi deger cift sayimi
        girilenSayi%2 isleminnin sonucu 0 ise tam bolunur cift sayidir.

        Kullanicinin girdigi sayi 7 ninkati mi
        girilenSya%7  sonuc 0 ise yedinin katidir.

        kullanicinin girdigi sayinin birler basamgi
        girilenSayi%10

         */

        int girilenSayi=3426;
        int birderBassam=girilenSayi%10;
        System.out.println("Birler Basamagi :"+birderBassam);//6

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//342

        int birlerBasamagi = girilenSayi % 10;
        System.out.println("Birler Basamagi :"+birlerBasamagi);//6

        girilenSayi=girilenSayi/10;

        System.out.println(girilenSayi);//342

        birlerBasamagi = girilenSayi % 10;
        System.out.println("Birler Basamagi :"+birlerBasamagi);//6

        girilenSayi=girilenSayi/10;

        System.out.println(girilenSayi);//342
    }
}
