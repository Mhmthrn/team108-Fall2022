package day16_Arrays;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki
        pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
         */
        int [] sayilar= {3,7,1,9,-3,-11,-50};
        System.out.println(arrraydekiPozitifSayilariTopla(sayilar)); // 20
    }

    public static int arrraydekiPozitifSayilariTopla(int [] arr){

        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i]>0){
                toplam+=arr [i];
            }

        }
        return toplam;

    }
}
