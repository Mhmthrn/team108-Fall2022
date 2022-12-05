package day14_doWhileLoop_Scope;

public class C03_DoWhileLoop {
    /*
    verilen baslangic ve biits karakterleri dahil
    aradaki tumkarakterleri yazdirin
     */


    public static void main(String[] args) {
        char baslangic= 'd';
        char bitis='z';

        do {
            System.out.print(baslangic+ " ");
            baslangic= (char) (baslangic+1);

        }while (baslangic<=bitis);
    }
}
