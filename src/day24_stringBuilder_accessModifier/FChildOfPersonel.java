package day24_stringBuilder_accessModifier;

import day25_inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {
        FChildOfPersonel obj1=new FChildOfPersonel();
        System.out.println(obj1.isim);
       // obj1.privateMethod(); child class olsa bile parent clastaki privat methoda ulasamaz

    }

}
