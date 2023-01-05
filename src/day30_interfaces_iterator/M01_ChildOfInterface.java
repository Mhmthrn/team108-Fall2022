package day30_interfaces_iterator;

import day29_final_abstracktClasses.FChild;

public class M01_ChildOfInterface  implements  I01_Interface,I02_Interfaces {

    /*
    Bir class baska bir clasi extends ile parent edinebilir ancak birden fazla clasi
    parent edinemez.

    Interfaces ler icin boyle bir sinirlama yoktur bir class istedigi kadar interfacei
    implement edebilir.

     */
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI2);

        I01_Interface.method34();


        M01_ChildOfInterface obj=new M01_ChildOfInterface();
        obj.method44();

    }// eger birden afazla inaterfaces implement edildiginde, ayni isimde methodlar farkli interfacelerde
    //  varsa return type a bakilir. Return type ayni ise sorun olmaz cunku ikisinide implement edebiliriz
    //  ancak return typleri farkli ise birini tercih ettigimizde digeri hata veriri. bu durumda parent interfacelere muda
    //  halketmek mumkunese orada hallederiz. veya bu interfecalerden birini implement etmekten vazgecilmelidir.
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
