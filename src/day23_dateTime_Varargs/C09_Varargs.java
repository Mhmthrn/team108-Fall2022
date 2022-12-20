package day23_dateTime_Varargs;

public class C09_Varargs {
    public static void main(String[] args) {
        /*
        Argument olarak tamsayilar alip
        son argument haric geriye kalanlari toplayip
        bulunan son argument ile carpip
        sonucu yapdiran bir method olusturun
        (Argument sayisi degisken olabilir)
         */

      //  islemYap(3,4,5,6,7);

        /*
        Varargs sinirsiz sayida element alma ozelleigine sahiptir
        dolaysiyla varargs olarak tanimlanan bir parametreden sonra
        parametre kullanirsaniz cte olusur.

        cunku vaargs tum argumentleri almak ister
        bu durumda sonraki parametre elemnet kalmaz

        Kural=Bir methodda parametre olarak varargs kullanilacaksa son parametre
        oolarak kullanilmalidir.

        Bir methodda bir den fazla varargs kullanilamaz
        parametrelerin data turunun degismesi bu kurali etkilemez
         */

    }

   /* private static void islemYap(int ... geriyeKalanlar,int ilkSayi,) {

        int geriyeKalanlarToplami=0;

        for (int each : geriyeKalanlar){
            geriyeKalanlarToplami+=each;

        }
        System.out.println(ilkSayi*geriyeKalanlarToplami);

    }*/
}
