package day25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){
        System.out.println("Paramatresiz Corolla cons calisti");
    }
    ECorolla(String param1){
        super("gri");
        System.out.println("String parametreli cons calisti.");
    }
    String model="Corolla";
    String uretimYeri="Turkiye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla("Mavi");

       /*
       Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
       cons calismalidir.

       Inheritance 'da biliyoruz ki child class dan olusturulan her obje parent classtaki ozelliklere de sahip olur

       Parent class daki ozelliklere ship olabilmesi ici paretn class daki cons larda calismalidir.

       Java bu calismayi super () cons call sayesinde saglar.

       Java da her olusturlan  class da gorunesede default cons oldugu gibi
       extends keyword kullanilan her class da olusturulan her cons in
       gorunmesede ilk satirinda super() vardir.

        */
    }
}
