package day17_arrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */

        // dinamik hale getirmek icin once inner arraylerden en kisasini bulmamiz gerekir

        int[][] arr = {{3,4,5}, {2,3,6,7,8},{6,2}};

        int enKisaInnerArrLengt=arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKisaInnerArrLengt){
                enKisaInnerArrLengt=arr[i].length;
            }

        }
        // ayni indexteki elemetleri topladigimizda koyacagimiz tek katli
        // bir arr olusturalim
        int [] toplamlarArr=new int[enKisaInnerArrLengt];

        int toplam=0;


        for (int i = 0; i <enKisaInnerArrLengt ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                toplam+=arr[j][i];
            }
            toplamlarArr[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlarArr));//[11, 9]


    }
}
