package day24_stringBuilder_accessModifier;

public class EncapsuleClass {

    /*
    Java class uyelrine erisimi write and read olarak ayrilmasi istendiginde
    Encapsulation kullanir.

    bunun icin oncelikle bu class uyelerine normal yollarla erisimi kapatabilir

    sonra istedigimiz yetkiyi verecek public methodu olustururuz
     */

    private int satis;// satis bolumunden deger girilsin ama degeri gorunmesin==> setter
    private  int toplamSatis=0;// gorulebilsin ama degistirilemesin==> getter

    private int halkaAcikSayi=10;//==> hem getter hem setter olusturulur

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+=this.satis;
    }
}

