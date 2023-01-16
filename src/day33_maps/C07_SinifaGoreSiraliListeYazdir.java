package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    /*
    tum ogrenci listesini sinif sube isim soyisim no seklinde
     dogal sirali olarak yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Ebubekir-Gokkaya-10-H-MF");

        MapMethodDepo.sinifaGoreSiraliYazdir(ogrenciMap);

    }
}
