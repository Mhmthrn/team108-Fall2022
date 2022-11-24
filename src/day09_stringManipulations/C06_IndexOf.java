package day09_stringManipulations;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {

        // kullanicidan aldigimiz "cok ile baslayan ilk kelimeyi yazdirin
        // cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle=scan.nextLine();

        if (!girilenCumle.contains("cok")){
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else {
            int cokIndex=girilenCumle.indexOf("cok");
            int boslukIndexi=girilenCumle.indexOf(" ",cokIndex+1);
            System.out.println(girilenCumle.substring(cokIndex, boslukIndexi));

        }





    }
}
