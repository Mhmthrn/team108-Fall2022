package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    //verilen bolumdeki ogrencilerin no isim soysisim ve siniflarini yazdiran bir method olusturalim

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlustuma(ogrenciMap,"MF");
    }
}
