package day29_final_abstracktClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("Parent class daki mecburu override edilecek method1'i oveeride ettik");

    }

    @Override
    public void method2() {
        System.out.println("Parent class daki mecburu override edilecek method2'i oveeride ettik");

    }

    /*
    Klasik inheritance ile parent chold iliskisi olusturdugumuzda parent class daki
    tum ozellikleri otamaik olarak kazaniriz
    Ancak methodlari overirde etme zorunlulugu yoktur.

    ister override edop kendimize ozellestirir
    istersek de parent class daki hali ile kullaniriz.
     */

    public static void main(String[] args) {
        //DParent obj1=new DParent();
        //'DParent' is abstract; cannot be instantiated
        // Abstrackt classlarin cons. lari vardir ama obje uretilemez.

        EChild chld1=new EChild();

        chld1.method1();//Parent class daki mecburu override edilecek method1'i oveeride ettik
        chld1.method2();//Parent class daki mecburu override edilecek method1'i oveeride ettik
        chld1.method3();//Parent class daki method 3 calisti

        DParent chld2=new EChild();
        chld2.method1();//Parent class daki mecburu override edilecek method1'i oveeride ettik
        chld2.method2();//Parent class daki mecburu override edilecek method1'i oveeride ettik
        chld2.method3();//Parent class daki method 3 calisti




    }
}
