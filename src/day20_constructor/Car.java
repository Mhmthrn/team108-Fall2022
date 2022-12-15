package day20_constructor;

public class Car {
    /*
    Bir class'tan olusturulabilecek objenin ozelliklerini variable ve methodlarla belirleyebiliriz
     */
    String marka="Marka Belirtilmemis";
    String modell=" Model Belirtilmemis";
    int yil=1900;
    int km;
    String renk="Renk secilmedi";

    public Car(String marka, String modell, int yil) {
        this.marka=marka;
        this.modell=modell;
        this.yil=yil;

    }

    public static void hareket(){
        System.out.println("Tum arabalar hareket eder");
    }

    public Car (String mrk,String mdl, int yl, int kmetre,String rnk){
        marka=mrk;
        modell=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;


    }

    public Car(String marka, String modell, int yil, String renk) {
        this.marka = marka;
        this.modell = modell;
        this.yil = yil;
        this.renk = renk;
    }
/*
        Bir class'da gorunur bir constructor olusturdugumuzda
        Java default constructor'i siler
        Bu durumda daha onceden default constructor'i kullanarak obje olusturan class'larda CTE olusur
        Bu tur sorunlara sebep OLMAMAK icin
        biz herhangi bir constructor olusturdugumuzda
        bir tane de parametresiz constructor OLUSTURURUZ
        Constructor'da parametre olarak kullanicidan gelen degeri
        class level'daki instance variable'a atamaliyiz
        eger parametre ismi ile instance variable ismi farkli ise sorun yok
        java otomatik olarak atamamizi anlayacaktir
        public Car(String mrk, String mdl, int yl, int kmetre, String rnk) gibi
                marka=mrk;
                model=mdl;
                yil=yl;
                km=kmetre;
                renk=rnk;
        Eger parametre isimlerini anlasilir olmasi icin instance variable ile ayni yaparsak
        Java'nin ayni isimdeki iki variable'in hangisinin parametre, hangisinin instance olacagini bilmesi gerekir
        bu durumda instance variable'i belirlemek icin basina this. yazariz
        public Car(String marka, String model, int yil)
        this.marka=marka;
        this.model=model;
        this.yil=yil;
     */


    public Car(){

    }





























    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n modell='" + modell + '\'' +
                "\n yil=" + yil +
                "\n km=" + km +
                "\n renk='" + renk + '\'' +
                '}';
    }
}
