package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<Integer> List1=new ArrayList<>();
        List1.add(10);
        List1.add(20);

        List<Integer> List2=new ArrayList<>();
        List2.add(20);
        List2.add(10);

        List<Integer> List3=new ArrayList<>();
        List3.add(20);
        List3.add(10);

        System.out.println(List1.equals(List2));// false


        System.out.println(List2.equals(List3));// true
    }
}
