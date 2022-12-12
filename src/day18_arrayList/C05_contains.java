package day18_arrayList;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {

        int [] arr={1,7,8,5,6,9,8,5,4,7,1,2,3,6,9,8,9,5,5,8,};
        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[1, 7, 8, 5, 6, 9, 8, 5, 4, 7, 1, 2, 3, 6, 9, 8, 9, 5, 5, 8]

        System.out.println(sayilar.contains(3));//true
        System.out.println(sayilar.contains(0));//false


    }
}
