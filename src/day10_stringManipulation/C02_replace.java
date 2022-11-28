package day10_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren, adana ye :)";

        System.out.println(str.replace("a", "A"));//JAvA ogren, AdAnA ye :)

        System.out.println(str.replace(" ", "")); // Javaogren,adanaye:)

        System.out.println(str.replace("Java", "Yazilim ogren, adana kebap ye"));// Yazilim ogren, adana kebap ye ogren, adana ye :)

        String telefon="5553551234";
        System.out.println(telefon.replace("555", "532"));// 5323551234

        /*
        asagidaki arama sonucunun 10.000 den fazla oldugunu test edin
        1-16 of over 100,000 results for “apple”

         */

        String sonuc= "1-16 of over 100,000 results for \\“apple\\”";


        int indexOver=sonuc.indexOf("over");
        int indexResult=sonuc.indexOf("results");

        String sonucSayiStr= sonuc.substring(indexOver+5,indexResult-1);
        System.out.println(sonucSayiStr); // 100,000

        sonucSayiStr= sonucSayiStr.replace(",","");
        System.out.println(sonucSayiStr); //100000

        int sonucSayisiInt= Integer.parseInt(sonucSayiStr);

        if (sonucSayisiInt>10000){
            System.out.println("arama sonuc testi PASSED");
        }else {
            System.out.println("arama sonuc testi failed");
        }


    }
}
