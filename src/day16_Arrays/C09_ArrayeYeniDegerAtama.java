package day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int [] arr1={1,2,3};

        //arr1={3,6,9,8};
        //arr1={3,6,9};

        //arr1=new int[5];
        System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0]


        // 14 stirdaki atama ile Java arr1'in pointerini eski arr1'den silip
        // ne keyword ile olusturdugumuz yeni arr1 e yonlendirir.

        // eski elemenleri de korumak istersek ne yapmaliyiz?
        // o zaman atama yapmadan once yeni arr yi hazilamaliyiz
        // bunun icin bos bir yeni arr olusturup
        // eski arr'deki elementleri yeini arr ye tasiyip
        // sonra atamayi yapabiliriz

        int [] temp=new int[5];

        for (int i = 0; i <arr1.length ; i++) {
            temp[i] = arr1[i];

        }
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]

        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]

        arr1=temp;
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 0, 0]


    }
}
