package day23_dateTime_Varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Argument olarak tamsayilar alip
        ilk argument haric geriye kalanlari toplayip
        bulunan ilk argument ile carpip
        sonucu yapdiran bir method olusturun
        (Argument sayisi degisken olabilir)
         */

        islemYap(3,4,5,6,7);
        islemYap(3,1);
        islemYap(4);
    }

    private static void islemYap(int ilkSayi,int ... geriyeKalanlar) {

        int geriyeKalanlarToplami=0;

        for (int each : geriyeKalanlar){
            geriyeKalanlarToplami+=each;

        }
        System.out.println(ilkSayi*geriyeKalanlarToplami);

    }
}
