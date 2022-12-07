package day16_Arrays;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        Verilen bir array’de
        istenen bir elemanin var olup olmadigini ve
        varsa kac kere kullanildigini yazdiran bir method olusturun.
         */
        int [] arr={2,3,42,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayi=2;
        elemanBul(arr, arananSayi);//radiginiz 2 array'de 3 adet kullanilmistir.
    }
    public static void elemanBul(int [] arr, int arananSayi){
        int sayac =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr [i]== arananSayi){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan sayi arrayde yoktur");
        }else {
            System.out.println("Aradiginiz "+ arananSayi + " array'de "+ sayac +" adet kullanilmistir.");
        }

    }
}
