package day09_stringManipulations;

public class C07_IlkTest {
    public static void main(String[] args) {

        // gitigimiz web sayfsindan aldigimiz
        // String arama sonuclarinida arma sayisinin
        // 50 sen fazla joldugunuzu test edin

        String input = "1-48 of 87 results for \"nutella\"";


        int indexOf = input.indexOf("of");
        int indexResult = input.indexOf("result");

        String sonucSayisiString = input.substring(indexOf + 3, indexResult - 1);

        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt > 50) {
            System.out.println("Nutella arama testi PASSED\nArama sonucu :" + sonucSayisiInt);

        } else {
            System.out.println("yeterli arama sayisi yok, arma testi FAILD");
        }


    }
}
