package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {
        Queue<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);//[H, K, B, K]

        // 1. indexe F ekleyin
        // Queue ozelliginden dolayi araya eleman ekleme yuapamazyiz
        //harfler.add(1,"")

        System.out.println(harfler.remove());//H
        System.out.println(harfler);//[K, B, K]
        System.out.println(harfler.remove("K"));// true
        System.out.println(harfler);//[B, K]

        //element();
        System.out.println(harfler.element());//B   --> Q nun basindaki elemani getir ama silmez, eger Q bossa hata veriri


        //peek();
        System.out.println(harfler.peek());// B --> Q nun basindaki elemani getir ama silmez, eger Q bossa null doner

        Queue<String> karakterler=new LinkedList<>();

        //karakterler.element();//NoSuchElementException

        System.out.println(karakterler.peek());// null

        System.out.println(harfler.poll());// B --> Q nun basindaki elemani getir ve siler, eger Q bossa null doner
        System.out.println(harfler);//[K]

       // System.out.println(karakterler.remove());//NoSuchElementException
        System.out.println(karakterler.poll());//null

        harfler.offer("C");
        System.out.println(harfler);//[K, C]

        // add ile offer arasindaki fark offer varsa kapasiteyi kontrol eder kapasite uygunsa ekler
        // add ise kapasiteye bakmazsizin direk ekler.


    }
}
