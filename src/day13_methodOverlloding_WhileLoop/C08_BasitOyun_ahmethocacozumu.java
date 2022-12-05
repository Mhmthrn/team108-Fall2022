package day13_methodOverlloding_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C08_BasitOyun_ahmethocacozumu {
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
        int sayac = 1;

        while (tutulanSayi!= tahminSayi) {
            System.out.println("Lutfen 1 ile 100 arasinda bi sayi degeri giriniz");
            tahminSayi = scan.nextInt();

            if (tahminSayi == tutulanSayi) {
                System.out.println(sayac+" tahmin ile tutugum sayiyi buldun");

                if (sayac <= 3) {
                    System.out.println("Vaowww :)))))");
                } else if (sayac >= 4 || sayac <= 8) {
                    System.out.println("Aferin !!!!!!");
                } else {
                    System.out.println("Basarisiz oldunuz");
                }
                break;

            } else if (tahminSayi < tutulanSayi) {
                System.out.println("Tahmininizi buyultunuz");
                sayac++;

            } else{
                    System.out.println("Tahmininizi Kucultunuz");
                sayac++;



            }

            }


        }
    }

