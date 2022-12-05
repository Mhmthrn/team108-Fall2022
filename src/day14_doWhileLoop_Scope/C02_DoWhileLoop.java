package day14_doWhileLoop_Scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        do {
            System.out.println("LLutfen toplamak icin tam sayilar giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi != 0);
        System.out.println("girilen sayilarin toplami : "+toplam);

        /*
        While loop ta ilk sart saglanmazsa loop body calismaz
        ancak do While loopta loop body en az 1 kere mutlaka calisir.
         */
    }
}
