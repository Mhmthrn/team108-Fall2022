package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EnrtySet {
    public static void main(String[] args) {
        // tum ogrencileri 101=Ali-Can-11-H-MF

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        System.out.println("No Ogrenci Bilgileri");
        System.out.println("=====================");
        // once ogrenci numaralarini else edelim

        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106]


        for (Integer eachkey : ogrenciNoSet) {
            System.out.println(eachkey + "=" + ogrenciMap.get(eachkey));
        }


        /*
        Aslinda bizden istenen map in icindeki elementler
        Java mapdeki elementleri key=value ikilisi olarak birlikte ele albilmek icin
        ENTRY interfacesi olusturmustur.

        entry ler de map ile ayni data yapisina sahip olmalidir.
        ornegin ogrenci mapi ni dusunursek anrty ler
        Enrt<Integer,String>


         */
       Set<Map.Entry<Integer,String>> ogrenciEntrySet= ogrenciMap.entrySet();
        System.out.println("No Ogrenci Bilgileri");
        System.out.println("=====================");
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet){

            System.out.println(eachEntry);

    }


    }
}
