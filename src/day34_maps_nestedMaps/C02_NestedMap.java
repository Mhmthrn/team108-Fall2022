package day34_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C02_NestedMap {
    /*Asgidaki body map olark olusturun
    {
        "firstname" : "Ahmet",
        "lastname" : "Bulut",
        "totalprice" : 500,
        "depositpaid" : false,
        "bookingdates" : {
               "checkin" : "2021-06-01",
               "checkout" : "2021-06-10"
                  },
        "additionalneeds" : "wi-fi" }*/
    public static void main(String[] args) {

        Map<String,String> bookingDatesMap=new HashMap<>();

        bookingDatesMap.put("checkin","2021-06-01");
        bookingDatesMap.put("checkout","2021-06-10");

        Map<String,Object> bookingMap=new HashMap();
        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put("lastname" , "Bulut");
        bookingMap.put("totalprice" , 500);
        bookingMap.put("depositpaid" , false);
        bookingMap.put("bookingdates" ,bookingDatesMap);
        bookingMap.put("additionalneeds" , "wi-fi");

        System.out.println(bookingMap);
        /*
        {firstname=Ahmet,
         additionalneeds=wi-fi,
         bookingdates={checkin=2021-06-01,
         checkout=2021-06-10},
         totalprice=500,
         depositpaid=false, lastname=Bulut}
         */

        // isim bilgisini yazdiralim

        System.out.println(bookingMap.get("firstname"));//Ahmet

        // additionalneeds yzdirin
        System.out.println(bookingMap.get("additionalneeds"));

        // check=in yazdirin

        // booking mapindeki value data turu Objeckt sectik
        // dolaysiyla booking dates key ine ait value nin objeckt olarak bize getirir
        // ama biz onun map oldugunu biliyoruz
        // casting yapabiliriz.

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));//2021-06-01


        // check out u yazdiralim
        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout"));//2021-06-10


    }
}
