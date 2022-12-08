package day17_arrays;

import java.util.Arrays;

public class C01_binarySerch {
    public static void main(String[] args) {
        int [] arr={2,8,4,1,9,3,6};

        System.out.println(Arrays.binarySearch(arr, 2));//-5 falsch

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 8, 9]

        System.out.println(Arrays.binarySearch(arr, 2));// 1
        System.out.println(Arrays.binarySearch(arr, 82));//5

        // Olmayan bir element girdigimiz zaman ne olur?

        System.out.println(Arrays.binarySearch(arr, 0));// -1
        System.out.println(Arrays.binarySearch(arr, 5));// -5
        System.out.println(Arrays.binarySearch(arr, 18));// -8
        /*
        olmayan bir elementi binaryserch ile aratirsak
        once listede olsaydi kacinci sirada olurdu sorusunun cevabini bulur
        olmadigini belirtmek iscin basina - koyar
         */


    }
}
