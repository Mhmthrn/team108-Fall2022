package day30_interfaces_iterator;

public interface I01_Interface {

    /*
    Interface lerde tum methodlar public ve abstract tir . yazip yazmamamiz fark etmez.

    Interfacelerde tum variablar public, static ve final dir.
    final oldugundan sonra deger atanamaz olusturulurken deger atanmasi gerekir.
     */
    int SAYI=10;
    public static final String OKUL_ISMI="Yildiz Koleji";

    public int SAYI2=20;


    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();

    /*
    Bir interface sonradan bir method eklemek istedigimizde
    o interface i daha once implement eden tum classlar
    yeni eklenen methodu implement etmek zorunda olur

    Java ya yapilan talepler sonuncunda
    Java8 ile birlikte bu konuda bir istisna getirilmistir.

   Eger sonradan eklenen methodun tum eski classlar tarafindan implement edilme
   mecburuyeti olmasin istiyorsak.
   yeni olusutdugumuz methoda DEFAULT VEYA STATIC  keywword ekleyip
   body olusturdugumuzda o zaman methodun chil classlar tarafindan implement edilme
   mecburuyeti olmaz.
     */
   public default void method44(){
        System.out.println("Inteface deki default olarak isaretlenen method calisti.");

    }

    public static void method34(){
        System.out.println("Inteface deki static isretlenen method calisti.");
    }



}
