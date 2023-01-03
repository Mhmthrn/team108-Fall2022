package day28_exceptions;

public class C07_ExceptionsTurleri {
    public static void main(String[] args) {

        String str="234";

        // str a sayisal olarak 5 ekleyip yazdirin

        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayi olmayan bir karakter olursa NumberFormatException oluyor.
        Object sayiObj=str;
        Integer sayiInt=(Integer)sayiObj;

        System.out.println(sayiInt);// ClassCastException

    }
}
