package day10_stringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str="Java heyecandir";

        // eger tum alari degilde sadece ilk ayi degistirmek istersek o zaman
        System.out.println(str.replaceFirst("a", "A"));// JAva heyecandir

        // ilk harf veya rakamai
        System.out.println(str.replaceFirst("\\w", "*"));//*ava heyecandir


    }

}
