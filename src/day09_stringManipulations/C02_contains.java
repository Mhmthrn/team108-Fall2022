package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str="Java ogren, mutlu ol";

        // str mutlu iceriyor mu

        System.out.println(str.contains("mutlu"));// true

        // charSequence : char dizisi
        // aradigimiz metnin String olmasi sart degil cahr da arata bilirmiyiz

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));//true space
        System.out.println(str.contains(""));//true hiclik

        // contains methodu kac tane oladuguna degil sadece var olup olmadigina bakar


    }
}
