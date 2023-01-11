package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayisiniBulma {
    /*
    verilen bir cumlede kullanilan her bir harfi ve
    kac kere kullanildigini yazdirin

    Ornek= Java candir.
    output: j=1,a=3,v=1,c=1,n=1,d=1,i=1,r=1
     */

    public static void main(String[] args) {
        String cumle="Java candir.";

        // oncelikle bosluk ve noktalama israreetlerini yok edelim

        cumle=cumle.replaceAll("\\W","");// Javacandir

        String [] cumleArr=cumle.split("");

        Map<String,Integer> kullanimSayilariMap=new TreeMap<>();

        for (int i = 0; i < cumleArr.length; i++) {
            // her bir elementi ele alip
            // map de key olarak yoksa value =1 olarak ekleriz
            // map de key olarak varsa value 1 artirilmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){

                kullanimSayilariMap.put(cumleArr[i],1);

            }else {

                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);

                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }

        }

        System.out.println(kullanimSayilariMap);



    }
}
