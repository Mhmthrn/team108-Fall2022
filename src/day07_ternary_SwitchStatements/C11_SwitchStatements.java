package day07_ternary_SwitchStatements;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini
        ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
         I : International S : Software T : Testing Q : Qualifications B: Board
         */
        char harf='S';

        switch (harf){

            case 'I':
            case 'i':
                System.out.println("I : International");
                break;
            case 'S':
            case 's':
                System.out.println("S : Software");
                break;
            case 'T':
            case 't':
                System.out.println("T : Testing");
                break;

            case 'Q':
            case 'q':
                System.out.println("Q : Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Tanimsiz harf secimi");




        }

    }
}
