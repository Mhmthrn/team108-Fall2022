package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        /*
        java da bir cok yapida get ve set methodlari bulunur

        get bir bilgiyi getirir
        set istedigimiz bilgiyi gunceller
         */
        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);//[A, Z, T]

        // 2. index e F elemanini ekleyin
        // add methodu var olan bir listeden herhangi bir elementi degisrmeden
        // istedigimiz elementi ekler
        harfler.add(2,"F");
        System.out.println(harfler);// [A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]

        // set var olan elementi gunceller


    }
}
