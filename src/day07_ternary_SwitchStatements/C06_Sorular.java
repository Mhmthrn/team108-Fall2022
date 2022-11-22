package day07_ternary_SwitchStatements;

public class C06_Sorular {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        int input =44;

        System.out.println(input>=50 ? "Sinifi Gectin": "Maalesef Kaldin");


        /*
        Soru 3- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin
         */

        char karakter='a';


        System.out.println(karakter>='a' && karakter<='z' ? Character.toUpperCase(karakter) :karakter );



        // kullanicidan bi rsayi alin ve mutlak degerini yazdirin.

        input=-4545;

        System.out.println(input<0 ? (-1)*input: input);


    }
}
