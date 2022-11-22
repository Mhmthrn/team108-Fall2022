package day07_ternary_SwitchStatements;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        /*
        Kullanicidan alinan deger
        100'den buyukse sayiyi iki ile caprp
        100'e esit veya kucukse 10 ekleyin

         */
        int input=45;

        if (input>100){
            input*=2;

        }else {
            input+=10;
        }
        System.out.println("If else : "+input);

        input=45;

        input=input>100 ? input*2: input+10;
        System.out.println("Ternary : "+input);


        /*
        verilen inputu inceleyin
        eger 100 den buyukse bunu 5 'e bolup bolum sonucunun tek sayi olup olmadigini kontrol edin
        eger 100 den buyuk degilse , 10 ile bolumundsen kalani bulup bu kalani 5 artirin

        bu tur komplex islemleri ternary ile yapmayiz
         */



    }
}
