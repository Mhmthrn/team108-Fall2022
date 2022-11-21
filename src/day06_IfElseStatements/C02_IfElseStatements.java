package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen iiznekar  ise "Ikizkenar ucgen" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if ((kenar1 == kenar2 && kenar1 != kenar3) ||
            (kenar2 == kenar3 && kenar2 != kenar1) ||
            (kenar3 == kenar1 && kenar3 != kenar2)) {
            System.out.println("Ikizkenar ucgen");
        } else {
            System.out.println("Ikizkenar  ucgen degil");
        }
    }
}
