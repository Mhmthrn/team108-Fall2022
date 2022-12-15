package day21_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int [] arr={3,6,8};
        // bir method olusturun methodda arr ye 5 elementli yeni bir arr atayin ve
        // yazdririn.Main methoda donduklten sonra tekrar yazdirin

        arryiDegistir(arr);//[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));//[3, 6, 8]


    }
    public static void arryiDegistir(int [] b){

        b=new int [5];
        System.out.println(Arrays.toString(b));

    }
}
