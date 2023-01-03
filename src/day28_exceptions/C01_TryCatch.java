package day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alip sayilari bir birine bolup sonucu yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Birbirine bolmek icin iki tamsayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            //1- try bolumu= yapmak istedigimiz ama exceptions riski olusturan kodlar
            System.out.println("Iki sayinin bolumu : "+ sayi1/sayi2);
        } catch (Exception e)
        // 2- catch() = bekledigimiz muhtemel excp. ni deklare ettigimiz,
        //           bu excp. gerceklesirse hata dokumanini store edebildigimiz variabledir.
        {
            System.out.println("Bolecek sayi 0 olamaz");
            e.printStackTrace();
            //3- catch blogu= exception gerceklestiginde calismasini istedigimiz kodlar.
                            // burayi yazarken oncelikle
                            // excp. olustugunda kodlar calismasi dursun mu?
                            // yoksa devam mi etsin karar vermeliyiz
        }
    }

}
