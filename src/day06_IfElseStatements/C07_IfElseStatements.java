package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    /*
    Soru 2- Kullanicinin kilo(kg) ve boyunu(cm)
     isteyip vucut kitle endeksini hesaplayin
     (kilo*10000 / (boy *boy)) vucut kitle endeksi
     30’dan buyukse obez, 25-30 arasi ise kilolu,
     20-25 arasi ise normal, 20’den kucukse zayif yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kilonuzu Kg olarak giriniz");
        double kilo=scan.nextDouble();
        System.out.println("Lutfen boyununzu cm olarak giriniz");
        double boy=scan.nextDouble();

        double vke=kilo*10000/(boy*boy);

        System.out.println("Vucut Kitle Endeksiniz :"+vke);

        if (vke>=30) System.out.println("Obezsiniz, dikkat etmelisiniz");
        else if (vke>=25) System.out.println("Kilolusunuz, kilo vermeniz tavsiye edilir");
        else if (vke>=20) System.out.println("Kilonuz normal :))");
        else System.out.println("Zayifsiniz kio almaniz tavsiye olunur");

        }

    }



