package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        /*
        Ornek :
        Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu degilse) 65 ve ustu ise BB,
        (65 ve ustu de degilse) 50 ve ustu ise CC,
        (geriye kalanlar) DD
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu giriniz");
        double girlenNot=scan.nextDouble();

        if (girlenNot<0 || girlenNot>100){
            System.out.println("Gecersiz Not ");
        } else if (girlenNot>=85) {
            System.out.println("Notunuz AA");
        }else if (girlenNot>=65){
            System.out.println("Notunuz BB");
        } else if (girlenNot>=50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Notunuz DD Kaldiniz");
        }
    }
}
