package day10_stringManipulation;

import java.util.Scanner;

public class C09_FoorLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve botos degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in
        //kati olan sayilai yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Luten baslangic degerini giriniz");
        int baslangic= scan.nextInt();

        System.out.println("Luten bitis degerini giriniz");
        int bitis= scan.nextInt();

        for (int i = baslangic ; i <=bitis; i++) {
            if (i%5==0){
                System.out.println(i+ " ");
            }


        }
    }
}
