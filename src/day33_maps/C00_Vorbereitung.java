package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C00_Vorbereitung {
    // ogrenci listemizi Bolum Isim Soyisim Sinif Sube No seklinde yazdiriniz
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.obsSirali(ogrenciMap);
    }
}
