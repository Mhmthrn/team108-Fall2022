package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {
        /*
        Verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin

         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazadirma(ogrenciMap,"10");


    }
}
