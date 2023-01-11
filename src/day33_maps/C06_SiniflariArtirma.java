package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        /*
        \ogrnci mapdeki tum sinif degerlerini 1 artirin
        12.sinifta olan varsa sinif bilgisini mezun yapin
         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArttir(ogrenciMap);
        ogrenciMap=MapMethodDepo.siniflariArttir(ogrenciMap);
        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
