package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] [] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4

        System.out.println(arr[2] [1]);//7

        System.out.println(arr[3]);//[I@58372a00
        /*
        MultiDimensional arrayle calisirken yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz
        bir element mi dondurdugudur.
         */
        System.out.println(Arrays.toString(arr[3]));//[2]

        // 21. satirdaki 2 elementini yapdirmak istersek
        System.out.println(arr[3][0]);////2

        System.out.println(Arrays.toString(arr));//[[I@4dd8dc3, [I@6d03e736, [I@568db2f2, [I@58372a00, [I@378bf509]

        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]



    }
}
