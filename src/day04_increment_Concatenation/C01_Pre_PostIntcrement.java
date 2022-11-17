package day04_increment_Concatenation;

public class C01_Pre_PostIntcrement {
    public static void main(String[] args) {

        int sayi=20;

        // sayiyi 3 artir

        sayi=sayi+3;
        sayi+=3;
        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi);//29

        // sayinin degerini iki azaltin

        sayi=sayi-2;
        sayi-=2;
        sayi--;
        sayi--;
        System.out.println(sayi);// 23

        sayi=10;
        // sayinin degerini 1 azaltin sonra yazdirin
        sayi--;
        System.out.println(sayi); // 9

        sayi=10;
        // sayiyi once yazdirin sanra bir azaltin
        System.out.println(sayi);//10
        sayi--;
        //ekranda gorulen 10, ama sayinin son degeri 9
        System.out.println(sayi);// 9

        sayi=10;
        System.out.println(sayi++);//10

        System.out.println(sayi);//11

        sayi=10;
        System.out.println(++sayi); // 11

        System.out.println(sayi);// 11

    }
}
