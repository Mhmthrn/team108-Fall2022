package day27_overriding;

public class EPerant extends DGrandParent{
    @Override
    protected void method1() {
        System.out.println("EP method1");
    }
    //  @Override notasyonu overridden method ile overriding methodu iliskilendirir
    //  eger overriden methoda bu iliskiyi bozacak bir degisiklik yapilirsa
    //  @Override CTE verir.

    protected void method2(){
        System.out.println("EP method2");
    }

    private void method3(){
        System.out.println("EP method3");
    }


}
