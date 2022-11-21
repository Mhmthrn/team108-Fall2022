package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStetaments {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
         yoksa girilen harfi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter<='a' && karakter>='z'){
            System.out.println((char) (karakter-32));
        }else {
            System.out.println(karakter);
        }
    }
}
