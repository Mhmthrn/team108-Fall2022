package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {
        /*
        verilan bir arr 'yi tekrar eden elementleri silip arriyi unique degerlerden olusan
        bir arr haline getiriniz.
         */
        int [] arr={1,7,8,5,6,9,8,5,4,7,1,2,3,6,9,8,9,5,5,8,};

        List<Integer> benzersizElementlerList=new ArrayList<>();

        // arr deki tum elementleri alip listede var mi diye kontrol edelim
        // olmayanlari ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizElementlerList.contains(arr [i])){
                benzersizElementlerList.add(arr[i]);
            }

        }

        System.out.println(benzersizElementlerList);//[1, 7, 8, 5, 6, 9, 4, 2, 3]

        // soruda bu degerleri arr ye atamamizi istiyor

        arr=new int[benzersizElementlerList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=benzersizElementlerList.get(i);

        }

        System.out.println("Arrayin son hali : "+ Arrays.toString(arr));//Arrayin son hali : [1, 7, 8, 5, 6, 9, 4, 2, 3]



    }
}
