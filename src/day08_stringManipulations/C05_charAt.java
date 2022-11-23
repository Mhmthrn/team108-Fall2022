package day08_stringManipulations;

public class C05_charAt {
    public static void main(String[] args) {

        String str="Java Guzeldir";// 13 tane karakter barindirir

        // javada index 0'dan baslar
        //  J==> 0. index, r==> 12.index
        // charAt(index) ile istedigimiz index teki chara ulasabiliriz.

        // ilk ayi
        System.out.println(str.charAt(1));// a

        // sondan 2. harf
        System.out.println(str.charAt(13 - 2));// i

        // sandan 4 uncukarakteri buyuk harfle yazdirin
        System.out.println(str.charAt(13-4));//l
        System.out.println(str.toUpperCase().charAt(13-4));// L

        // charAt methodu bize cahr dondurdugu icin toUpperCase calismaz
        // string methodlarini charAt ile kullanmak isterssek charAt den once kullanmaliyiz

        System.out.println(str.charAt(13)); // hata verir StringIndexOutOfBoundsException

    }
}
