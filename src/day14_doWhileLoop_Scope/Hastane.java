package day14_doWhileLoop_Scope;

public class Hastane {

    static String hastanIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {

        Hastane p1=new Hastane();
        p1.personelIsmi="Kemal";


        Hastane p3=new Hastane();
        p3.personelTel="321457859996";



    }
}
