package day31_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekralardanKurtulma {
    public static void main(String[] args) {
        /*
        Verilen bir arr deki tekrar eden elementleri sadece bir kere yazarak
        arr yi kisaltan bir kod yazin
         */
        int [] arr={1,2,4,2,3,5,6,2,4,5,6};

        Set<Integer> arrSet=new HashSet<>();

        // arr deki tumelementleri set e ekliyelim

        for (int i = 0; i < arr.length; i++) {
            arrSet.add(arr[i]);


        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]

        // Set i tekara arr ye atayalim . Set deki elemnetler sayisinca arr ninlengtini belirleyip
        // aoraya atayali,

        arr=new int[arrSet.size()];
        int index=0;
        for (int each:arrSet){
            arr[index]=each;
            index++;

        }

        System.out.println("Arr nin son hali : "+ Arrays.toString(arr));//Arr nin son hali : [1, 2, 3, 4, 5, 6]


    }
}
