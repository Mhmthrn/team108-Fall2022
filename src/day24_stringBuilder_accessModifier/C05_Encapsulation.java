package day24_stringBuilder_accessModifier;

public class C05_Encapsulation {
    public static void main(String[] args) {
        /*
        Access modifiers bir class uyesine erisimi sinirlandirirken
        gorme yetkisi(read) ve degistirme yetkisini(write) ayirt edemez.

        Ama gercek hayatta bu ihtiyac vardir
        bazi class uyelerinin readable olmasi istenirken
        bazi class uyelerinin sadece writeable olmasi istenir
        ve bazi class uyeleri icin iki yetki istenir.

        Java bu yetkilendirme islemini encapsulatin ile cozmustur.

        Sadece yazma yetkisi icin setter, sadece okuma yetkisi icin getter methodu
        kodlarimizin daha anlasilabilir sekilde atama ve yazma islemlerini yapmasi iscin
        birlikte kullanilabilir.
        bazi devolopperlar boyle yapmyi tercih eder.
         */
    EncapsuleClass obj1= new EncapsuleClass();
    obj1.setSatis(100);
    obj1.setSatis(200);
    obj1.setSatis(300);

    System.out.println(obj1.getToplamSatis());//600

    obj1.setHalkaAcikSayi(400);
    System.out.println(obj1.getHalkaAcikSayi());//400

    }
}
