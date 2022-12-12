package day18_arrayList;

import day16_Arrays.C10_ArrayeBirElemetEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        String [] arr={"a","b","t"};

        //bu array e elemet olerek c elementi eklemek istersek
       arr= C10_ArrayeBirElemetEkleme.arreyeElementEkleme(arr,"c");

        System.out.println(Arrays.toString(arr));

        /*
        Array list esnek uzunlukta bar array dir
        Ancak ArrayList, array altyapisini kullandigindan
        elementleri tek tek ekleyebiliriz
         */
        List<String> harfler=new ArrayList<>();

        System.out.println(harfler);// []
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);//[A, B, K]

       harfler.add(1,"C");
        System.out.println(harfler);//[A, C, B, K]



        List<String> karakterler= new ArrayList<>();
        karakterler.add("*");
        karakterler.add("+");

        harfler.addAll(karakterler);
        System.out.println(harfler);//[A, C, B, K, *, +]

        harfler.addAll(2,karakterler);
        System.out.println(harfler);//[A, C, *, +, B, K, *, +]


    }
}
