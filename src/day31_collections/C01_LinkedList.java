package day31_collections;

import java.util.*;

public class C01_LinkedList {
      /*
            Collections objeleri bir arada tutan yapilardir
            Gercek hayattaki ihtiyaclara gore Java farkli collection yapilari olusturmustur
            Bir uygulamada hangi collection'i kullanacagimiza istedigimiz ozelliklere gore karar veririz

            Colections temel de 3 ana gruba ayrilir ve 3 Interface ile kurallari belirlenmistir
                - List
                - Queue
                - Set
            Ancak Interface'lerden obje olusturulamayacagi icin
            child class'larinin constructor'lari kullanilir.
            Burada ozelikleri belirleyen constructor degil DATA TURU olarak secilen collection'dir

            Ornegin Linked list olustururken sececegimiz data turu ile
            Queue, Deque, List veya tumunun ozelliklerini tasiyan LinkedList'ler olusturabiliriz
         */
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll2=new ArrayList<>();
        Queue <String> ll3=new LinkedList<>();
        Deque<String > ll4=new LinkedList<>();
    }
}
