package day34_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfSayilari=new TreeMap<>();
        harfSayilari.put("A",10);
        harfSayilari.put("C",15);
        harfSayilari.put("D",3);
        harfSayilari.put("K",5);
        System.out.println(harfSayilari);//{A=10, C=15, D=3, K=5}

        System.out.println(harfSayilari.subMap("C", "F"));//{C=15, D=3}

        System.out.println(harfSayilari.subMap("C", "K"));//{C=15, D=3} C dahil K haric
        System.out.println(harfSayilari.subMap("B", "K"));//{C=15, D=3}

        System.out.println(harfSayilari.descendingMap());// {K=5, D=3, C=15, A=10} tersten yazdirdi

        System.out.println(harfSayilari.lowerKey("E"));// D e den daha az olan
        System.out.println(harfSayilari.lowerKey("D"));// C

        System.out.println(harfSayilari.floorKey("E"));//D

        System.out.println(harfSayilari.higherKey("D"));// K

        System.out.println(harfSayilari.ceilingKey("D"));//D


        System.out.println(harfSayilari);//{A=10, C=15, D=3, K=5}

        System.out.println(harfSayilari.headMap("D"));//{A=10, C=15}
        System.out.println(harfSayilari.headMap("D",true));//{A=10, C=15, D=3}

        System.out.println(harfSayilari.tailMap("C"));//{C=15, D=3, K=5}

        System.out.println(harfSayilari.tailMap("C", false));//{D=3, K=5}

        System.out.println(harfSayilari.pollFirstEntry());//A=10
        System.out.println(harfSayilari);//{C=15, D=3, K=5}
        System.out.println(harfSayilari.pollLastEntry());//K=5
        System.out.println(harfSayilari);//{C=15, D=3}

    }
}
