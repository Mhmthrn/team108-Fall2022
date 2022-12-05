package day14_doWhileLoop_Scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0 a basrsa islemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=5;
        int toplam=0;


        while (girilenSayi != 0){
            System.out.println("LLutfen toplamak icin sayilar giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }
        System.out.println("girilen sayilarin toplami : "+toplam);

        /*
        while loop'un iki tane negatif yonu vardir
        1- loop dan once olusturdugumuz ve loop'da kullanacagimiz variablelere
        yanlis bir deger verirsek, loop body hic calismayabilir.
        2- loop conditionu loop body den bir fazla calisir

        bu negatifler inu kullanilmaz yapacak buyuklukte degildir.
        ancak
         */

    }
}
