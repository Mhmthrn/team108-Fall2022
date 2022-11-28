package day10_stringManipulation;

public class C08_ForLoop {
    public static void main(String[] args) {
        // 1 ve 1000 arsindaki sayilari yan yana yazdirin
        // yazdirma islemi bittiginde
        // tum bu sayilarin toplamini yazdirin

        int toplam=0;

        for (int i = 1; i <=1000 ; i++) {

            System.out.print(i+ " ");
            toplam+=i;

        }
        System.out.println();
        System.out.println("Sayilarin Toplami = "+toplam);


    }
}
