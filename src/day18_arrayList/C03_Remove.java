package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);//[10, 5, 7, 9]

        //sayilar.remove(5);//IndexOutOfBoundsException
        /*
        eger listemiz int lerden olusuyor  ise
        parametre olarak yazdigimiz sayinin index mi yolsa silmek istedigimiz obje mi oldugu
        belirli olmasin diye
        java girilen sayiyi otamatik index kabul eder.
         */

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement));//true

        System.out.println(sayilar);//[10, 7, 9]

        silinecekElement=20;
        System.out.println(sayilar.remove(silinecekElement));// false

    }
}
