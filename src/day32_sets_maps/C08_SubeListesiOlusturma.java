package day32_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {
        // verilen sinif ve sube ismi ile sinif listeseini yazdiran method olusturun.

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazadirma(ogrenciMap,"10");
    }
}
