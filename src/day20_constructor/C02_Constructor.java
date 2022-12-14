package day20_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        /*
        bir obje olusturulurken
        istedigimiz ozellikleri direk atayabilirsek
        sonradan tekrar bir atama islemi yapmama gerek kalmaz

        bu durumda tamayi te tek bizim yapmamiz yerine
        contructor un atama yapmasini istemeliyiz

        atama yapmak icin contructora parametre gondermeliyiz
         */
        karesiniYazdir(5);//25
        karesiniYazdir(10);//100

        Car car1= new Car("BMW","5.20",2022,15,"Beyaz");
        System.out.println(car1);
        /*
        Car{marka='BMW'
            modell='5.20'
            yil=2022
            km=15
            renk='Beyaz'}
         */
        Car car2=new Car("Tofas","Sahin",2010);
        System.out.println(car2);
        /*
        Car{marka='Tofas'
            modell='Sahin'
            yil=2010
            km=0
            renk='Renk secilmedi'}
         */
    }

    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }
}
