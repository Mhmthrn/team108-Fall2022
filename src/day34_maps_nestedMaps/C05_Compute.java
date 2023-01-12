package day34_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfSayilari=new TreeMap<>();
        harfSayilari.put("A",10);
        harfSayilari.put("C",15);
        harfSayilari.put("D",3);
        harfSayilari.put("K",5);

        System.out.println(harfSayilari);//{A=10, C=15, D=3, K=5}

        // Anin Kullanim miktarini 20 yapin
        harfSayilari.put("A",20);

        // C nin kullanim miktarini 2 katina cikar
        harfSayilari.put("C",harfSayilari.get("C")*2);

        System.out.println(harfSayilari);//{A=20, C=30, D=3, K=5}

        // D nin miktarini 5 artiralim
         harfSayilari.compute("D",(k,v)-> v+5);
        System.out.println(harfSayilari);//{A=20, C=30, D=8, K=5}

        // eger map de t varsa kullanim miktarini 3 eksiltin

        harfSayilari.computeIfPresent("T",(k,v)-> v-3);
        System.out.println(harfSayilari);//{A=20, C=30, D=8, K=5}

        // K harfi varsa kullanimini iki azaltin
        harfSayilari.computeIfPresent("K",(a,b)-> b-2);
        System.out.println(harfSayilari);//{A=20, C=30, D=8, K=3}

        // T harfi yoksa kullanim miktari 3 olarak atayin

        harfSayilari.computeIfAbsent("T",v-> 3);
        System.out.println(harfSayilari);//{A=20, C=30, D=8, K=3, T=3}



    }

}
