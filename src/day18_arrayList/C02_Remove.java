package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        System.out.println(harfler.remove("B"));// true
        System.out.println(harfler);//[A, C]

        List<String> yeniList=new ArrayList<>();

        yeniList.add("E");
        yeniList.add("B");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harfler));
        System.out.println(yeniList);


    }
}
