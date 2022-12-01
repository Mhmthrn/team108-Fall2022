package day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinasi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sirasiyla islem yapmak istediginz iki sayi giriniz");
        double girilenSayi1=scan.nextDouble();
        double girilenSayi2=scan.nextDouble();
        System.out.println("Lutfen yapmak isdeginiz islemi seciniz\n" +
                "Toplama icin :  +\n" +
                "Cikarma icin :  -\n" +
                "Bolme icin   :  /\n" +
                "Carpma icin  :  *  "          );
        char secilenIslem=scan.next().charAt(0);

        /*
        kullanicidan iki sayi ve istedigi islemi alin
        bir method olusturup sayilara istenen islemi uygulayip sonucu
        bize dondurun.
         */





    }

    public static double hesapMakinasi(double girilenSayi1, double girilenSayi2,char secilenIslem) {

        switch (secilenIslem){

            case '+':
                return girilenSayi1+girilenSayi2;

            case '-' :
                return girilenSayi1-girilenSayi2;

            case  '/' :
                if (girilenSayi2==0){
                    System.out.println("Sayinin sifira bolmu tanimsizdir");
                    break;
                }else {
                    return girilenSayi1/girilenSayi2;
                }
            case  '*' :
                return girilenSayi1*girilenSayi2;

            default:
                System.out.println("Tanimsiz islem girisi");
                }
            return secilenIslem;

    }
}
