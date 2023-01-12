package day34_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {
        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();


        Map<String,String> ogrenci101= new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("sayisim","can");
        ogrenci101.put("sinif","11");
        ogrenci101.put("sube","h");
        ogrenci101.put("bolum","Mf");

        Map<String,String> ogrenci102= new HashMap<>();
        ogrenci102.put("Isim","Ali");
        ogrenci102.put("sayisim","cem");
        ogrenci102.put("sinif","10");
        ogrenci102.put("sube","k");
        ogrenci102.put("bolum","TM");

        Map<String,String> ogrenci103= new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("sayisim","cem");
        ogrenci103.put("sinif","11");
        ogrenci103.put("sube","k");
        ogrenci103.put("bolum","TM");


        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);
        /*
      { 101={sinif=11, sube=h, sayisim=can, Isim=Ali, bolum=Mf},
        102={sinif=10, sube=k, sayisim=cem, Isim=Ali, bolum=TM},
        103={sinif=11, sube=k, sayisim=cem, Isim=Ali, bolum=TM}}
         */

        // 101 numarali ogrencinin ismini yazdiralim
        System.out.println(ogrenciMap.get(101).get("Isim"));//Ali

        // 102 numarali ogrencinin sinif bilgisini yazdirin
        System.out.println(ogrenciMap.get(102).get("sinif"));//10

        // 103 numarali gorencinin sinifini 12 yapin

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEnrtySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> eachOgrenciEntry:ogrenciEnrtySet){

           if (eachOgrenciEntry.getKey()==103){
               Map<String, String> eachOgrenciValueMap = eachOgrenciEntry.getValue();

               eachOgrenciValueMap.put("sinif","12");
               eachOgrenciEntry.setValue(eachOgrenciValueMap);
           }



        }
        System.out.println(ogrenciMap);



    }
}
