package day32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {




    // bize ogrenciMap donduren bir method olusturun

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection= ogrenciMap.values();

        // 2- for-each kullanarak her bir value'yu ele alalim  Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim 0.index
        // 5- eger value'den aldigimiz isim, aranan isim ile ayni ise
        //    true dondurup, for-each'i bitirelim
        // 6- for-each bittiginde true olmadiysa false dondurelim


        for (String eachValue:valuesCollection
        ) {

            String[] valueArr= eachValue.split("-");
            String valuedekiIsim= valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }

        return false;

    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        //1- Map'deki vaueleri bir collection olarak kaydedelim
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection <String> ogrenciValueCollection=ogrenciMap.values();
        // listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("Isim Soyisim Sinif Sube");
        //2-foreach ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        //3- valueyi - ile split yapip bir arr elde edelim [Ali-Can-11-H-MF]
        //4- arrayin 1. indexindeki soyisme bakip aranan soyisim ile ayni ise
        // isim soysism sinif ve sube bilgilerini yazdiralim.

        for (String eachValue:ogrenciValueCollection){
            String [] valueArr=eachValue.split("-");
            String valueSoyisim=valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+ " "+
                                   valueArr[1]+" "+
                                   valueArr[2]+" "+
                                   valueArr[3]);
            }
        }

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueColletion=ogrenciMap.values();

        System.out.println("Isim Soyisim");

        for (String eachValue:valueColletion){

            String [] valueArr=eachValue.split("-");

            if (valueArr [2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0]+ " "+valueArr[1]);
            }

        }
    }



    public static Map<Integer, String> numaraIleSubeGuncelleme(Map<Integer, String> ogrenciMap, int okulNo, String ySube) {

        //1- okul numarasini biliyoruz direk ogrenci valueye ulasbiliriz

        String ogrenciValue=ogrenciMap.get(okulNo);
        String [] valueArr=ogrenciValue.split("-");

        //2- Sube ismini guncelleyelim
        valueArr[3]=ySube;

        //3- Arr deki guncel bilgileri yeniden value formatina soklaim
        String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];


        //4- ogrenci no ile yani key ile yeni value yi mape ekleyelim

        ogrenciMap.put(okulNo,yeniValue);

        return ogrenciMap;

    }
}
