package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    /*
    Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
    kullaniciya musteri karti olup olmadigini sorun.
    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
    Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunAdedi=scan.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati=scan.nextDouble();

        System.out.println("Musteri Kartiniz varmi\nE : Evet ,H :Hayir ");
        char kartVarMi=scan.next().charAt(0);

        if (kartVarMi=='E'&& urunAdedi>=10){
            System.out.println("%20 Indirimli Toplam Tutar :"+ (urunAdedi*listeFiyati*0.8));
        } else if (kartVarMi=='E' && urunAdedi>0) {
            System.out.println("%15 indirimli Toplam Tutar"+ (urunAdedi*listeFiyati*0.85));
        } else if (kartVarMi=='H' && urunAdedi>=10) {
            System.out.println("%15 indirimli Toplam Tutar"+ (urunAdedi*listeFiyati*0.85));
        } else if (kartVarMi=='H' && urunAdedi>0) {
            System.out.println("%10 indirimli Toplam Tutar"+ (urunAdedi*listeFiyati*0.9));
        }else {
            System.out.println("Hatali Bilgi Girisi");
        }


    }
}
