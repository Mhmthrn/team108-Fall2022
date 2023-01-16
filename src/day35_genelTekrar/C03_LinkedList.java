package day35_genelTekrar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.zip.ZipFile;

public class C03_LinkedList {
    // verilen bir LinkedList de istenen iki indexin yerlerini degistirin
    public static void main(String[] args) {
        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Said");
        isimler.add("Huseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Humeyra");

        System.out.println(isimler);//[Said, Huseyin, Hasan, Sevilay, Humeyra]

        // hasan ile humeyranin yerlerini degistirelim
        // buyuk bir listede index bilmeden

        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkIsim;

        int ilkIsimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);

        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler); //[Said, Huseyin, Humeyra, Sevilay, Hasan]


    }
}
