package day25_inheritance;

public class DToyota extends Car{

    DToyota (){
        System.out.println("Parametresiz Toyota cons calisti");
    }
    DToyota(String param1){
        System.out.println("Parametreli Toyotacons claisti.");
    }
    String marka="Toyota";
    String uretimYeri="Toyota farkli ulkelerde uretilir";
}
