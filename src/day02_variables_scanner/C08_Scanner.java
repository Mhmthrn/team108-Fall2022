package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen alanini hesaplamak istediginz Didortgenin iki kenar uzunligunu giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("Dikdortgenin alani :"+ kenar1*kenar2+" cm²");

    }
}
