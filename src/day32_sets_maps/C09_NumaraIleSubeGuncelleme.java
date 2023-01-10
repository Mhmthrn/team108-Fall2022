package day32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    //Nuarasi verilen ogrencinin sube ismini
    // verilen sube yapan bir method olusturun
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

       ogrenciMap= MapMethodDepo.numaraIleSubeGuncelleme(ogrenciMap, 104,"T");
       ogrenciMap= MapMethodDepo.numaraIleSubeGuncelleme(ogrenciMap, 105,"W");
        System.out.println(ogrenciMap);
    }
}
