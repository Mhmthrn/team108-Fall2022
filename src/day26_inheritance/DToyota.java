package day26_inheritance;

public class DToyota{
    /*
    Bir objenin data turu cons olarak kullanilan class veya o clasin parent class lari olabilir.
    data turu olarak parent class secilmesindeki amac chold clasdan olusturulan objenin parent
    clasin tum child classlarinin tasidigi ortak ozellikleri vurgulamaktir.
    (persosnel toplantisina katilan Doktor Kemal, bashemsire Ayse gibi)

    Data turu ile cons farkli oldugunda variable ile methodlar farkli davranirlar.
    variablelerin alacagi degeri bulmak icin aramaya data turu olan class dan baslariz o class
    da yoksa parentlarina bakariz.Ilk buldugumuz degeri atama yapariz.

    data turu olan class veya parenlarinda bulunamazda CTE olur.
     */



    String marka="Toyota";
    String model="Model belirtilmedi";
    String motor="motor belirtilmedi";
    String yakit="yakit belirtilmedi";

}
