package day06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedIfElse {
    /*
    Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
    kullaniciya musteri karti olup olmadigini sorun.
    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
    Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();

        System.out.println("Musteri Kartiniz varmi\nE : Evet ,H :Hayir ");
        char kartVarMi = scan.next().charAt(0);

        if (kartVarMi=='E' || kartVarMi=='e'){
            if (urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if (urunAdedi>=10) System.out.println("%20 indirimli toplam Tutar :"+urunAdedi*listeFiyati*0.8);
            else System.out.println("%15 indirimli toplam Tutar :"+urunAdedi*listeFiyati*0.85);

        }
        else if (kartVarMi=='H' || kartVarMi=='h'){
            if (urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if (urunAdedi>=10) System.out.println("%15 indirimli toplam Tutar :"+urunAdedi*listeFiyati*0.85);
            else System.out.println("%10 indirimli toplam Tutar :"+urunAdedi*listeFiyati*0.90);



        }else System.out.println("Kart bilgisi gecersiz");
    }
}
