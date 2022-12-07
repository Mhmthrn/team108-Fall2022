package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        // verilen bir arrnin neutral ordera gore siralayip yazdirin.

        String [] isimler={"Ali","Veli", "Cem", "Mahmut", "ahmet", "kemal"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ali, Cem, Mahmut, Veli, ahmet]
        System.out.println(Arrays.toString(isimler));// [Ali, Cem, Mahmut, Veli, ahmet, kemal]

        // eger buyukten kucuge siralamak istersek once sort neutral ordere gore siralar
        // sonra gecici bir arr kullananrak siralamayi terse ceviririz




    }
}
