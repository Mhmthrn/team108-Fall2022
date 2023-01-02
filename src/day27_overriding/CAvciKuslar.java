package day27_overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1=new CAvciKuslar();
        krt1.hareket();// CAvciKuslar
        krt1.beslenme();//CAvciKuslar
        krt1.pence();//CAvciKuslar
        krt1.gaga();//CAvciKuslar

        krt1.kanat();//BKuslar
        krt1.solunum();//BKuslar
        krt1.cogalma();//BKuslar
        krt1.omur();//AHayvanlar
        /*
        Eger cons ile data turu ayni ise ozelligin variable veya method olmasina bakilmaksizin
        o clasa gidilir o class vaya perent class larda bulunan ilk deger kullanilir.
         */

        BKuslar krt2=new CAvciKuslar();
        krt2.hareket();// CAvciKuslar
        krt2.beslenme();//CAvciKuslar
        //krt2.pence();//CTE BKuslar veya parent clas da yok
        krt2.gaga();//CAvciKuslar
        krt2.kanat();//BKuslar
        krt2.solunum();//BKuslar
        krt2.cogalma();//BKuslar
        krt2.omur();//AHayvanlar

        AHayvanlar krt3=new CAvciKuslar();
        krt3.hareket();// CAvciKuslar
        krt3.beslenme();//CAvciKuslar
        //krt3.pence();//CTE AHayvanlar  clas da yok
        //krt3.gaga();//CTE AHayvanlar  clas da yok
        //krt3.kanat();//CTE AHayvanlar  clas da yok
        krt3.solunum();//BKuslar
        krt3.cogalma();//BKuslar
        krt3.omur();//AHayvanlar





    }

}
