package day12_methodCreation;

public class C04_Faktoryel {
    public static void main(String[] args) {
        /*
        verilen bir sayinin 15 den kucuk bir pozitif tamsayi oldugunu kontrol edin
        kucukse method olusturup, faltoriyel degerinin yazdirin
         */

        int input =23;

        if (input>0 && input>15){
            faktoryelYazdir(input);
        }else {
            System.out.println("Girilen sayi 15'den kucuk pjozitif tamsayi olmalidir");
        }
    }

    public static void faktoryelYazdir(int sayi){
        int faltoryelSonuc=1;

        for (int i = sayi; i >=1 ; i--) {
            faltoryelSonuc*=i;

        }

        System.out.println("Girilen "+ sayi+" icin faktoriyel : "+ faltoryelSonuc);

    }
}
