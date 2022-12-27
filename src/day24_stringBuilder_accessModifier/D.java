package day24_stringBuilder_accessModifier;

public class D {
    private String isim="Mustafa";
    String isimDefault="Furkan";
   static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {
      //   System.out.println(isim); static degil

        D obj1=new D();
        System.out.println(obj1.isim);//Mustafa
        staticMethod();// Zafer
        System.out.println(obj1.isim);// Mustafa

    }
    private void staticOlmayanMethod(){
        isim="Husaeyin";
        System.out.println(isim);
    }
    void defaultStaticOlmayanMethod(){
        System.out.println("Default access modifierli static olmayanmethod calisti");
    }

    static void defaultStaticMethod(){
        System.out.println("Default access modifierli static method calisti");

    }
    private static void staticMethod(){
        D obj1=new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);

    }
}
