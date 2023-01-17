package day36_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    /*
    Kullanicidan pozitif bir tam sayi alip
    o sayidan sifira kadar olan sayilari toplayin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();


        toplaForloop(sayi);
        System.out.println("Recursive toplam : "+toplaRecursive(sayi));
    }

    private static int toplaRecursive(int sayi) {

        if (sayi > 0) {
            return (sayi + toplaRecursive(sayi - 1));

        } else {
            return sayi;

        }
    }

    private static void toplaForloop(int sayi) {
        int toplam=0;

        for (int i = 0; i <=sayi ; i++) {

            toplam+=i;

        }
        System.out.println("Toplam for loop ile : "+toplam);
    }
}
