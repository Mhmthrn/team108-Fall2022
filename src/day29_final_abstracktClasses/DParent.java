package day29_final_abstracktClasses;

public abstract class DParent {
    // Chil classrin tmamaminda method1 ve method2 nin mutlaka gorulmesini istiyoruz
    /*
    Jav parent class daki istenen methodlari child class larin override etmek zorunda kalmasi icin
    Abstrackt class ini olusturmustur.

    Bir clasi abstrackt yapmak istersek : class deklarasyonuna abstrackt yazmamiz yeterlidir.

    Bir abstrackt clasin icinde chold classlarin override etmesi mecburi olan methodlarolabilecegi gibi
    mecburi olamayan methodlarda olabilir.

    Child classlarin mutlaka override edecegi methodlari da abstrackt yapariz.

    Abstrackt yapilan tum methodlar child claslarin tamaminda override edileceginden
    parent class daki abstrackt methodun body e ihtiyaci olamaz.
    Java da abstrackt methodlarin bodyleri olmasina izin vermez.

    Abstrackt claslarda abstrackt methodlar bulundugu icin o claslardan obje uretilemez.
     */

    public abstract void  method1();
    public abstract void method2();

    public void method3(){
        System.out.println("Parent class daki method 3 calisti");

    }
}
