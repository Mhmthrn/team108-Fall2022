package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // verilen input a gore carpim tablosu olusturun


        int input =4;

        for (int i = 1; i <=input ; i++) {// i nin carpilacagi sayiyi kontrol edecek
            for (int j = 1; j <=input; j++) {// inner loop stun degiskenini ifade eder

                System.out.print(i*j+ " ");


            }
            System.out.println();

        }


    }
}
