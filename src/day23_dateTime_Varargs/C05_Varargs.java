package day23_dateTime_Varargs;

public class C05_Varargs {
    // verilen iki sayiyi toplayip yazdiran bir method olusturalim
    public static void main(String[] args) {
        topla(5,8);//13

        topla(5,7,3);//15

        topla(7,3,4,6);//20
    }

    private static void topla(int i, int i1, int i2, int i3) {
        System.out.println("4 Sayinin  Toplami : "+(i+i1+i2+i3));
    }

    private static void topla(int i, int i1, int i2){
        System.out.println("3 Sayinin Toplami : "+(i+i1+i2));

    }

    private static void topla(int i, int i1) {
        System.out.println("Sayilarin Toplami : "+(i+i1));
    }
}
