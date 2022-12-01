package day12_methodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        /*
        verilen bir stringi terse cevirip
        o hlini bize donduren bir method olusturun
         */
        System.out.println(metniTerseCevir("Java Candir"));
    }

    public static String metniTerseCevir(String str){
        String tersStr="";
        for (int i =str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);


        }
        return tersStr;

    }
}
