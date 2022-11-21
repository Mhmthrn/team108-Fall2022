package day05_ifStatemanets;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alip
        pozitif ise Pozitif Sayi,
        100 ile 999 arasinda ise(inirilar dahil) Pozitif uc basamakli sayi
        3 ile bolunebiliyorsa 3'un Kati
        birler basmagi 7 ise "Mukemmel" seceneklerinden uygun olanlari yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi>0){
            System.out.println("Pozitif Sayi");
        }
        if (100<=sayi && sayi<=999){
            System.out.println("Pozitif Uc basamakli sayi");
        }
        if (sayi%3==0){
            System.out.println("3'un Kati");
        }

        if (sayi%10==7 || sayi%10==-7){
            System.out.println("Mukemmel");
        }



    }
}
