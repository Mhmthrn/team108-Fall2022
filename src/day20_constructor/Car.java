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

    public Car(String a, String b, int c) {
        marka=a;
        modell=b;
        yil=c;

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
    /*
    Bir class ta gorunur bir cons olusturdugumuzda Java default cons siler
    Bu durumda daha onceden default cons. kullanarak obje olusturan class larda CTE olusur
    Bu tur sorunlara sebep olmamak icin
    bi zherhangi bir cons olusturdugumuzda bir tane de parametresiz cons olustururuz
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
