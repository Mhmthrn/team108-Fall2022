package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini alin
        // ve grilen ismi buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim=scan.nextLine();
        System.out.println(girilenIsim.toUpperCase());
    }
}
