package day12_methodCreation;

import java.nio.file.LinkPermission;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup almadigini true/ false olarak donduran bi method olusturun

        System.out.println(asalmMi(8));// yazdirabiliriz

        boolean asalMiSonucu59=asalmMi(59);// bir variableye atayabiliriz


    }

    public static boolean asalmMi (int input){
        boolean asalSayiMi=true;

        for (int i = 2; i < input; i++) {
            if (input%i==0){
                asalSayiMi=false;
                break;
            }

        }
        return asalSayiMi;
    }

}
