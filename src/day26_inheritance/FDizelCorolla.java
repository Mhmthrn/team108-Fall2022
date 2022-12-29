package day26_inheritance;



public class FDizelCorolla extends ECorolla{
    String motor="1.6 dizel motor";
    String yakit="Dizel ";
    String guvenlik="ABS";
    String renk="Renk belirtilmedi";

    public static void main(String[] args) {
        /*
        Bazen child class dan obje olusturmakla beraber bu
        child clasin parent class indaki hangi ozellikleri aldigini
        bilmek isteriz.

        Bu durumda data turu const i kullanilan class in parent
        class lardan secebiliriz.
        */

        DToyota c3=new FDizelCorolla();
        System.out.println(c3.motor);//T
        System.out.println(c3.yakit);//T

       // System.out.println(c3.guvenlik);//CTE
       // System.out.println(c3.renk);//CTE

        System.out.println(c3.model);//T

       // System.out.println(c3.uretimYeri);//CTE
       // System.out.println(c3.teker);//CTE
       // System.out.println(c3.vites);//CTE

        System.out.println(c3.marka);//T


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor);//T
        System.out.println(c2.yakit);//T
       // System.out.println(c2.guvenlik);//CTE
        //System.out.println(c2.renk);//CTE

        System.out.println(c2.model);//C
        System.out.println(c2.uretimYeri);//C
        System.out.println(c2.teker);//C
        System.out.println(c2.vites);//C

        System.out.println(c2.marka);//T


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");




        FDizelCorolla c1=new FDizelCorolla();

        System.out.println(c1.motor);//DC
        System.out.println(c1.yakit);//DC
        System.out.println(c1.guvenlik);//DC
        System.out.println(c1.renk);//DC

        System.out.println(c1.model);//C
        System.out.println(c1.uretimYeri);//C
        System.out.println(c1.teker);//C
        System.out.println(c1.vites);//C

        System.out.println(c1.marka);//T





    }
}
