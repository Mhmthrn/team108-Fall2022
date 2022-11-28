package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calismam lazim cok.";
        // ilk anin indexi ni yazdiralim
        System.out.println(str.indexOf("a"));// 1

        // son anin indexini yazdirin
        System.out.println(str.lastIndexOf("a"));//39

        System.out.println(str.lastIndexOf("a", 15));//3


        // verilen str da cok kelimesisin kullanimini kantrol edip
        // cok kelimesi kullanilmamis
        // bir kere kullanilmis
        // birden fazla kullanilmis
        // sonuclardan uygun olani yazdirin
        int ilkCokIndex=str.indexOf("cok");
        int sonCokIndex=str.lastIndexOf("cok");



        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmamis");
        }else if (ilkCokIndex==sonCokIndex){
            System.out.println("cok kelimesi bir kere kullanilmis");
        }else {
            System.out.println("cok kelimesi birden fazla kullanilmistir");
        }

    }
}
