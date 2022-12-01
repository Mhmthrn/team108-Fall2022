package day12_methodCreation;

public class C01_Method {
    public static void main(String[] args) {
        // methodlar bazen basit, bazen de komplex islemleri nasil yapapilur diye
        // dusunmek yerine hazi methodlari kullanmayi tercih ederiz
        // bozden sonra kodu iceleyen kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca
        // anlayabilirler ayrica her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus olacagiz

        String str= " Elhamdulillah Java'da yolu yariladik";

       str.isEmpty();// boolean sonuc dondu ama kullanmadik
        // methodun dondurdugu sonucu kullanmak istersek ya yazdiririz
        System.out.println(str.isEmpty());

        // yada bir avariableye atayip onu yazdirabiliriz

       String buyukHarfliHali = str.toUpperCase();


    }
}
