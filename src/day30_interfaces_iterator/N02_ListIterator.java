package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        // tum elementleri index kullanmadan 3 artirin

        ListIterator lit=sayilar.listIterator();

        System.out.println(sayilar);

        while (lit.hasNext()){

            Integer sayi=(Integer) lit.next();

            lit.set(sayi+3);
        }
        System.out.println("_+_+_+_+_+_+_+_");

        System.out.println(sayilar);

        // listedeki tum elementleri iterator kullanarak sondan basa dogru yazdirin

        // bir ustteki looop ile sona gittigimiz icin iterator suan en sonda yani olmasni
        // istedigimiz yerde.
        while (lit.hasPrevious()){

            System.out.print(lit.previous()+ " ");
        }




    }
}
