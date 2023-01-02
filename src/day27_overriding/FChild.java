package day27_overriding;

public class FChild extends EPerant{
    @Override
    protected void method1() {
        super.method1();


        // eger overridding method ile birlikte overridden method da calissin istersek
        // overridding icinden super.method1(); yazabiliriz.
    }

    @Override
    protected void method2() {
        super.method2();
    }
    public void method3(){
        System.out.println("FC method3");
        //parent class da ayni isimde method olmasina ragmen
        // overide olarak gorulmedi
        // paret daki method3 private accesmodifier a sahip oldugundan
        // onu ayri bir method olarak gorur, override olarak gormez.
    }
}
