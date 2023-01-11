package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {
    // map deki soyisimleri buyuk harfe  ceviren bir method olusturun.

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
