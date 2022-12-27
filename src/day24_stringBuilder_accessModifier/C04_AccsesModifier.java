package day24_stringBuilder_accessModifier;

public class C04_AccsesModifier {
    String str;

    // Access Modidier i gozlerimizle goremiyorsak default access modifier var demektir.

    // bu class ta default constructor var
    // str degeri null default degerdir.
    // str access modifier i default access modifier

    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.isimDefault);//Furkan
        obj1.defaultStaticOlmayanMethod();//Default access modifierli static olmayanmethod calisti

        // baska class lardaki clas uyelrine erisimde
        // access modifier ve static keywordu dikkate alinmalidir.
        // static class uyelerini obje uzerinden kullanmaya gerek yoktur
        // illa obje uzerinden kullanmak istersek class uyesinin ismini yazmamiz gerekir

        System.out.println(obj1.isimDefaultStatic);//Sevilay
        System.out.println(D.isimDefaultStatic);//Sevilay

        obj1.defaultStaticMethod();// Default access modifierli static method calisti

        D.defaultStaticMethod();// Default access modifierli static method calisti

    }
}
