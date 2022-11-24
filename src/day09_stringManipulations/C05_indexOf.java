package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {
        String str= "Java ile kodlama cok kolay";

        // str cok iceriyor mu
        System.out.println(str.concat("cok"));// true

        // kullanicidan aldigimiz cumlede cok ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf("cok")); // 17

        System.out.println(str.substring(17, str.length()));//cok kolay

        // 2. o nun taydirin

        int ilkOIndexi= str.indexOf("o");//10
        int ikinciOIndexi=str.indexOf('o', ilkOIndexi+1);
        System.out.println(+ilkOIndexi+""+ikinciOIndexi);// 10  18


    }
}
