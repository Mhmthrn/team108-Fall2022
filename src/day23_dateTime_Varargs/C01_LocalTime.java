package day23_dateTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();

        System.out.println(zaman);//10:06:53.263139200

        System.out.println(zaman.getMinute());//7

        System.out.println(zaman.withSecond(0).withNano(0));//10:08

        System.out.println(zaman.withSecond(1).withNano(1));//10:09:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250));//18:20:31.927527500

        // Bir for loop ile birden 10000 kadar olan sayilari yanyana yazdirin bu islemicin gecen zamani bulun

        LocalTime basZamani=LocalTime.now();

        System.out.println("Baslangic "+ basZamani);
        for (int i = 1; i <= 10000; i++) {

            System.out.print(i+" ");

        }
        System.out.println(" ");
        LocalTime bitiZamani=LocalTime.now();
        System.out.println("Bitis "+ bitiZamani);

        System.out.println("Islem suresi : "+ (bitiZamani.getNano()-basZamani.getNano())+ " nan saniye.");

        /*
        olusturdugumuz time veya date guncel zamani veya tarihi tutmamaya devam eden bir sayac degil
        olusturdugumuz satirdaki saati ve tarihi sistemden alan ve kaydeden variabledir.

        ilerleyen zamanda guncel tarih veya tarihie ihtiyacimiz oldugunda
        yeni time objesi olusturup
        o anki degeri alabiliriz.
         */

    }
}
