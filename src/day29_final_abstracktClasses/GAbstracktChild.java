package day29_final_abstracktClasses;

public abstract class GAbstracktChild extends DParent {
    /*
    Abstrackt bir classin abstrackt bir child clasi olugunda ,
    parent class daki methodlari implement etmek zorunda degildir.Ama isterse implement edebilir.

     */
    public void method1(){

    }

    public abstract void method4();

    public void method5(){
        //concrete method
    }
}
