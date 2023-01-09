package day31_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
    List data turunde bir linked list olusturalim
     */
        List<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        System.out.println(harfler);
        harfler.add("H");
        System.out.println(harfler);

        // 1. indexse M ekleyelim

        harfler.add(1,"M");
        System.out.println(harfler);
        // 2. indexe K yi L yapalim

        harfler.set(2,"L");
        System.out.println(harfler);

        List<String> karakterler=new LinkedList<>();

        karakterler.add("*");
        karakterler.add("%");
        karakterler.add("9");
        karakterler.add(2,"M");

        System.out.println(karakterler);

        System.out.println(harfler.retainAll(karakterler));//true

        System.out.println(harfler);//[M] ortak elementler disindaki harseyi sildi

        harfler.addAll(karakterler);
        System.out.println(harfler);//[M, *, %, M, 9]

        System.out.println(harfler.removeAll(karakterler));// true
        System.out.println(harfler);// []

        System.out.println(karakterler.subList(1, 3));//[%, M]

        System.out.println(karakterler);//[*, %, M, 9]

        System.out.println(karakterler.hashCode());//2212744

    }




}
