package day10_stringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {
        /*
        input olarak verilen sayidan baslayarak 7 ser artirarak input olark verilen bitis sayisina kadar
        tum sayilari kac aadet sayi oladugunu ve bu sayilarin toplamini yazdirin
         */
        int inputBas = 34;
        int inputBit=563;

        int toplam=0;
        int sayac=0;

        for (int i = inputBas; i <inputBit ; i+=7) {

            System.out.println(i+ " ");
            sayac++;
            toplam+=i;

        }
        System.out.println(" ");
        System.out.println("Toplam "+sayac+" adet sayi var\nBu sayilarin Toplami :"+toplam);
    }
}
