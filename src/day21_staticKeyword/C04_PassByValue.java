package day21_staticKeyword;

public class C04_PassByValue {

    public static void main(String[] args) {

        int fiyat=100;
        // %10, %20 ve %30 indirim uygulayip indirimli fiyati yazdinran uc method olusturalim
        inrdrimYap10(fiyat);//90
        inrdrimYap20(fiyat);//80
        inrdrimYap30(fiyat);//70

        System.out.println(fiyat);//100


    }
    public static void inrdrimYap10(int fiyat){

        fiyat=fiyat*90/100;
        System.out.println("%10 indirimli fiyat : "+fiyat);
    }
    public static void inrdrimYap20(int fiyat){

        fiyat=fiyat*80/100;
        System.out.println("%20 indirimli fiyat : "+fiyat);
    }
    public static void inrdrimYap30(int fiyat){

        fiyat=fiyat*70/100;
        System.out.println("%30 indirimli fiyat : "+fiyat);
    }
}
