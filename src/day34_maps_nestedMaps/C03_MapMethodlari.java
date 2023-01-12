package day34_maps_nestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsKey("Ali"));//False
        // value degerinin tamami sorulursa true, bir parcasi sorulursa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci Bulunamadi"));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(108, "Ogrenci Bulunamadi"));//Ogrenci Bulunamadi
        System.out.println(ogrenciMap.get(108));// null

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");

        System.out.println(ogrenciMap.get(103));//Ali-Cem-12-K-MF

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-12-K-MF"));//null

        ogrenciMap.replace(103,"Ali-Cem-12-K-MF", "Ali-Han-10-K-MF");

        System.out.println(ogrenciMap.get(103));//Ali-Han-10-K-MF

        // kontrol eder eski deger value ile ayni ise yeni degeri degistirir yoksa ignor eder


    }
}

