package day07_ternary_SwitchStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        /*
        Ternary isleminin sonucunu yazdiracaksak boolean sartin true veya false olmasi durumunda
        yazdiracagimiz datalar farkli data turunde olabilir.

        Ancak atama yapacaksak
        true veya false olmasi durumunda alacagi deger
        atayacagi variable data turune uygun olmalidir.
         */

        int sayi =10;

        System.out.println(sayi>10 ? "buyuk sayi": sayi+2);

        // int b= sayi>10 ?"buyuk sayi":sayi+2;

        // String c= sayi>10 ?"buyuk sayi":sayi+2;
    }
}
