package day20_constructor;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();
        Toyota toyota= new Toyota();

        System.out.println(car1);
        //Car{marka='Marka Belirtilmemis', modell=' Model Belirtilmemis', yil=1900, km=0, renk='Renk secilmedi'}

        System.out.println(toyota);//day19_arrayList_forEachLoop.Toyota@27bc2616
        // toyota obje oldugundan ozellillerini direk yazdiramayiz, referansini yazdirir.
        /*
        bir class tan olusan objelerin belirli ozelliklerini kolayca yazdirabilmek icin o class ta
        istenen ozelliklikleri kapsayan bir toString() methodu olustutulabiliri.
         */

        car1.marka="Audi";
        car1.modell="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";
        System.out.println(car1);
        /*
        Car{marka='Auidi'
            model='A4'
            yil=2020
            km=20000
            renk='Siyah'}
         */


    }
}
