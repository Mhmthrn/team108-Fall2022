package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_forEachLoop {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 1};
        List<Integer> list1 = new ArrayList<>();

        // arraydeki tum elemetleri liste koyalim

        for (Integer each : arr
        ) {
            list1.add(each);

        }
        System.out.println(list1);

        // array'deki cift sayilari olusturacagimiz bir list e tasiyalim
        List<Integer> ciftSayilarList = new ArrayList<>();
        for (Integer each : arr
        ) {
            if (each % 2 == 0) {
                ciftSayilarList.add(each);
            }
        }
        System.out.println(ciftSayilarList);
    }
}

