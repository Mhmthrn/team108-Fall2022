package day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static day16_Arrays.C10_ArrayeBirElemetEkleme.arreyeElementEkleme;

public class C11_Odev {
    public static void main(String[] args) {

        /*
        Kullanicidan yeni ismler alip var olan bir arr ye ekleyen bir method olusturun.
        Kullanici yeni deger verdigi muddetce C10daki methodu kullanarak eklemeye devam edin
        kullanici q bastiginda arr nin son halini dondurun.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ismi giriniz"
        +"\nEkleme islemini bitirmek icin Q ya, veya q basiniz");

        String girilenIsim=scan.nextLine();

        String [] yenihali=new String[1];

        while (!(girilenIsim.substring(0,1).contains("Q") || girilenIsim.substring(0,1).contains("q")) ){

            yenihali= arreyeElementEkleme(yenihali,girilenIsim);


        }
        System.out.println(Arrays.toString(yenihali));


    }
}
