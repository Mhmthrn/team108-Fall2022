package day13_methodOverlloding_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {

        /*
        random olarak 1 ile 100 arasinda bir sayi olusturun
        kullanici bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde
        tutrutugumuz sayi ile kardsilssip tahmini buyult/kucult diyelim
        kullanici tututugumuz sayisi bildiginde

        -3 vaya daha az tahminde bildiyse "Vaowww"
        - 4 -8 tahminde bilildiyse"Aferin"
        - aaha fazla tahminde bildiyse basariziz yazdirim
         */
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);


        int tahminSayi = 0;
        boolean flag = true;
        int sayac = 0;

        while (flag) {
            System.out.println("Lutfen 1 ile 100 arasinda bi sayi degeri giriniz");
            tahminSayi = scan.nextInt();

            if (tahminSayi == tutulanSayi) {
                sayac++;
                flag = false;
                break;
            } else if (tahminSayi > tutulanSayi) {
                System.out.println("Tahmininizi Kucultunuz");
                sayac++;
            } else if (tahminSayi < tutulanSayi) {
                System.out.println("Tahmininizi buyultunuz");
                sayac++;
            } else {
                if (sayac <= 10) {
                    System.out.println("10 Tahmin Hakkiniz Bitti");
                    break;
                }
            }
        }
        if (sayac <= 3) {
            System.out.println("Vaowww");
        } else if (sayac >= 4 || sayac <= 8) {
            System.out.println("Tahmininizi Kucultunuz");
            if (sayac <= 3) {
                sayac++;
            } else {
                System.out.println("Basarisiz oldunuz");
            }
        }
    }
}
