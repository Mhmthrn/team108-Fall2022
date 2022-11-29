package day11_forLoops;

public class C07_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
         */

        String input="zaman";

        String tersInput="";

        for (int i =input.length()-1; i >=0; i--) {

            tersInput+=input.substring(i,i+1);

        }
        System.out.println(input +" 'in "+"tersten yazilisi :"+tersInput);

    }
}
