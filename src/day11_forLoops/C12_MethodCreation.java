package day11_forLoops;

public class C12_MethodCreation {
    public static void main(String[] args) {
        /*
        verilen sayinin faktoriyelini hesaplayin
         */

        int input=6;
        int faktoriyel=1;

        for (int i =input ; i >=1 ; i--) {
            faktoriyel*=i;

        }
        System.out.println(input+ "! = "+faktoriyel);


        faktoriyelYazdir(7);

        // kodun ileleyen asamada 7! lazim oldu






    }

    public static void faktoriyelYazdir(int i) {
        int carpim= 1;

        for (int j =1; j <=i ; j++) {
            carpim*=j;

        }
        System.out.println(i+ "! = "+carpim);
    }


}

