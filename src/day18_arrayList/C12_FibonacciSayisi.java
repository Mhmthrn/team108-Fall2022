package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_FibonacciSayisi {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
         */
        System.out.println(fibonacciListesiOlustur());

    }
    public static List<Integer> fibonacciListesiOlustur(){
        List<Integer> fibonacciList=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac tane Fibonacci sayisi istediginizi giriniz");
        int n= scan.nextInt();

        //0 1 1 2 3 5 8 13 21 34 55
        if (n<1){
            System.out.println("Gecersiz sayi");
        } else if (n==1) {
            fibonacciList.add(0);
            return fibonacciList;

        } else if (n==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;

        }else {
            fibonacciList.add(0);
            fibonacciList.add(1);
            int sayi1=0;
            int sayi2=1;
            int sayi3=0;
            for (int i = 3; i <=n ; i++) {
                sayi3=sayi1+sayi2;
                fibonacciList.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
        }

        return fibonacciList;
    }
}
