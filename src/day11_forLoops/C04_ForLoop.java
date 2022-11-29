package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        // eger sart i'nin hicbir degeri icin true oluyorsa
        // loop calisir ama loop body devreye hic girmediginden islem yapilmaz

        // input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input= -23;

        if (input>1){
            for (int i = input; i >1 ; i--) {
                System.out.print(i+" ");

            }
        }else{
            for (int i =input; i <=1 ; i++) {
                System.out.print(i+" ");

            }
        }

        // eger sart i nin tum degerleri icin dogru oluyorsa

        for (int i = 1; i >0 ; i++) {
            System.out.print(i+" ");

        }

        // input olarak verilen sayidan 100 e kadar tum sayilari yazdirin

        System.out.println("");

        for (int i = input; i <=100 ; i++) { // eger i-- yapilirsa teknik olarak sonsuz loop olusur
            System.out.println(i+" ");

        }




    }
}
