package day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // verilen bir String arrayin tum elemenlerini yazdirin
        String [] isimler={ "Huseyin", "Yusuf", "Mehmet", "Akile","Said"};
        System.out.println(Arrays.toString(isimler));//[Huseyin, Yusuf, Mehmet, Akile, Said]

        for (int i = 0; i <isimler.length ; i++) {//Huseyin Yusuf Mehmet Akile Said

            System.out.print(isimler[i] + " ");
        }


    }
}
