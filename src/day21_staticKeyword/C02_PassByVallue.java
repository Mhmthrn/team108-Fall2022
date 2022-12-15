package day21_staticKeyword;

public class C02_PassByVallue {
    public static void main(String[] args) {
        /*
        Java PassByValue kullanir
        Yani methodlar arasinda ginderilen variablelerin
        kendileri degil, valueleri diger methodlara yollanir.
         */
        int fiyat=100;
        // fiyat uzerinden %10 indirim yapip,indirimli fiyati donduren bir method olusturun.
        System.out.println(indirimYap10(fiyat));//90.0
        System.out.println(indirimYap10(fiyat));//90.0
        System.out.println(indirimYap10(fiyat));//90.0
        System.out.println(indirimYap10(fiyat));//90.0

        System.out.println(fiyat);//100

        // eger indirimli fiyatinmizin kalici olarak degistirmek istersek
        // atama yapariz.
    }
    public static double indirimYap10(int a){

        a=a*90/100;

        return a;
    }
}
