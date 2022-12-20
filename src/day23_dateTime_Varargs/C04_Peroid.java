package day23_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Peroid {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(2019,7,30);
        LocalDate bugun= LocalDate.now();

        Period yas= Period.between(dogumTarihi,bugun);
        System.out.println(yas);//P3Y4M20D
        System.out.println(yas.getYears());//3

        LocalDate baslangic=LocalDate.of(2010,8,5);
        LocalDate bitis = LocalDate.of(2015,7,20);
        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure);//P4Y11M15D

    }
}
