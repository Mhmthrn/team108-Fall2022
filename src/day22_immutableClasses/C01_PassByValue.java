package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        // Verilen bir list de degisiklik yapan iki method olusturun.
        // 1. method listin elementlerine yeni deger atayip yazdirsin
        //2. method liste yeni bir list degeri atayip yeni liste elementler
        // ekleyip yazdirsin
        // her iki methodu cagirdiktan sonra methodda ki listi yazdiralim.
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);//[10, 34, 45]

        elemanlariDegistir(sayilar);//[25, 54, 67]

        System.out.println("1. method call dan sonra sayilar : "+sayilar);//[25, 54, 67]

        yeniListAta(sayilar);//[34, 98, 11]

        System.out.println(sayilar);//[25, 54, 67]

        /*
        Java PassByValue kullanir
        PassByValue, methoda gonderilen variablenin kendisini degil degerini gondermek demektir.
        primitive data turleri veya String gonderdigimizde , methoda yapilan degisiklik methodda kalir
        main methodda atama yapilmadikca main methodda ki variablenin degeri degismez

        PassByValue coklu element iceren array ve list gibi yapilar icin de gecerlidir
        anacak coklu elementi value olarak methoda gondermediginden array veya listin adresini gonderir.

        Eger methodda elemetlere atama yapilirsa main method daki elemetler de degismis olur.
        eger list veya array e yeni bir list vaya array degeri atanirsa bu atama methodda kalir.
        main methoddaki array ve list degismez.

        Araba ayni kaldigi muddetce icindekilerin degismesi passByValue ye aykiri degildir.
         */
    }
    public static void elemanlariDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("Elemanlari degistir methodunda List : "+sayilar);


    }
    public static void yeniListAta(List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni list ata methodunda sayilar listinin son hali : "+sayilar);

    }
}
