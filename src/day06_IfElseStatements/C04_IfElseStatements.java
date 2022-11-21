package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir karakter girmesini isteyin,
         girilen karakterin buyuk harf olup olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter <='Z' && karakter>='A'){

            System.out.println(" Girilen Karakter Buyuk harfdir.");
        }else {
            System.out.println("Girilen Karakter Buyuk harf degildir.");
        }
    }
}
