package day21_staticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");
    }
    static {
        // static bloklar clastaki tum yapilardan hatta main methoddan bile once calisir.
        // methodlarin ve atatic block larin siralamasi java acisindan onemli degildir
        // ancak birden fazla static block varsa kendi aralarinda once ustteki calisir.
        System.out.println("yukaridaki Static block calisti");
    }
    static {
        System.out.println("alttaki static block calisti");
    }
}
