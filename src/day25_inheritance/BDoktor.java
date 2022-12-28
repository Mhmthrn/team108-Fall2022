package day25_inheritance;

public class  BDoktor extends APersonel {

    /*
    Olusturdugumuz Doktor clasinda isim soysisim gibi persosnel clasindan
    olusturulan tum ozelliklerin olmasini istiyoruruz.
    Bu durumda iki tercih var
    1- Istenen tum ozellikleri bu class dada olusturabiliiriz

    2- Doktor clasini personelin childi yapmak

    Doktorclasini personek clasinin childi yaptigimizda doktor
    clasindan olusturulan objeler sadece kendi class larindaki ozelliklere
    sahip olmaz ayni zamanda parent clasi olan personelde ki ozelliklere
    de sahip olurlar.

    Bir chold class da obje olusturdugumuzda o objenin ozelliklerini
    belirlerken once kendi classina bakilir ve o ozellik varsa kullanilir.
    eger kendi clasinda yoksa parent clasa bakilir.
    onda da olmazsa CTE verir.

    Bir class extends keyword kullanarak baska bir clasi kendisine parent edinirse
    1- parent class daki tum ozellikleri direk kullanabilir(isim soysisim ozel sigorta)

    2- Isterse parent class da olan bir ozelligi kendisine uyarlayabilir

    3- Isterse parent ta olamayan kendisine ozel yeni ozellikler olusturabilir.(nobet)

     */
    public static void main(String[] args) {
        BDoktor doktor1=new BDoktor();
        doktor1.isim="Mehmet";
        doktor1.soyIsim="Malazgirt";
        doktor1.telefon="444555888777";

        System.out.println(doktor1.toString());
        doktor1.maas();
        doktor1.ozelSigorta();
        doktor1.nobet();

    }

    public  void  maas(){
        System.out.println("Doktor maasi 30*8 *25 : "+6000);
    }

    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutarlar.");
    }


}
