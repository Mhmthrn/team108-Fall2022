package day25_inheritance;

public class APersonel {
    protected String isim="isim Atanmadi";
    protected String soyIsim="Soysisim Atanmadi";
    protected String telefon="Telefon Atanmadi";

    protected   void maas(){
        System.out.println("Hastanemizde uygulanan asgari ucret 1700 Euro dur");
    }
    protected void ozelSigorta(){
        System.out.println("Tum personelin ozel saglik sigortasi yaptirilir.");
    }

    @Override
    public String toString() {
        return "APersonel{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    private void privateMethod(){
        System.out.println("Private method calisti");
    }
}
