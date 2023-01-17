package day35_genelTekrar;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {

    public static void main(String[] args) {
        /*
        Kullanicidan bolunecek sayi ve bolecek sayiyi alip
        bolme isleminin sonucunu carpma islemei ile bulan ve yazdiran bir method olusturun
        bu islemi bitimek icin q ya bassin.

         */
        Scanner scan=new Scanner(System.in);
        boolean devamEdelimmi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do {
            System.out.printf("Lutfen bolunecek tmasayiyi girin.\nbitirmek icin Q'ya basin.");

            try {
                bolunecekSayi=scan.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                bolenSayi=scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);
            } catch (InputMismatchException e) {
                String bolunecekSayiStr=scan.next();
                if (bolunecekSayiStr.equalsIgnoreCase("Q")){
                    devamEdelimmi=false;
                }else {
                    System.out.println("Bolunecek sayi tam sayi olmalidir");
                }

            }

        }while (devamEdelimmi);
    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {
        // bolunecek ve bolen sayi negatif veya pozitif olabilir
        // bu durumda oncelikle isaret kontrolu yapmamiz lazim
        // isaret sorununu cozmek icin once islem sonucunun isaretini belirleyip
        // sonra sayilari isaretten bagimsiz hale getirelim

        int sonucIsareti=1;

        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }
        bolunecekSayi=bolunecekSayi>-0 ?bolunecekSayi: bolunecekSayi*(-1);
        bolenSayi=bolenSayi>-0 ?bolenSayi: bolenSayi*(-1);

        int bolumSonucu=1;

        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }
        if (bolumSonucu*bolenSayi==bolunecekSayi){
            System.out.println("Bolme isleminin sonucu : "+ bolumSonucu*sonucIsareti);
        }else {
            System.out.println("Bolme isleminin sonucu : "+ (bolumSonucu-1)*sonucIsareti);
        }


    }
}
