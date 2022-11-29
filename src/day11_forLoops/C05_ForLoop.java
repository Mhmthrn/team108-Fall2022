package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tam sayi degerleri giriniz");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();

        int sayilarToplami=0;


        if (baslangic<bitis){

            for (int i = baslangic; i <=bitis ; i++) {

                sayilarToplami+=i;
            }
            System.out.println(baslangic+ " ile "+ bitis+ " arasindaki sayilarin toplami  :"+sayilarToplami);


        }else{
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");

        }

    }

}
