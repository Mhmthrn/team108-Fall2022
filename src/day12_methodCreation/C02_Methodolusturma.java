package day12_methodCreation;

public class C02_Methodolusturma {
    public static void main(String[] args) {

        // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun

        carpYazdir(5,6);
        carpYazdir(4.5,5.6);


    }

    public static void carpYazdir(double sayi1 ,double sayi2) {

        System.out.println("Girilen sayilarin carpimi = "+sayi1*sayi2);


    }
}
