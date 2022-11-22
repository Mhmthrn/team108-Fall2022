package day07_ternary_SwitchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // kulanicidan gun no alin hafta ici ise hafta ici
        // haftasonu ise hafta sonu yazdirin.
        int gunNo=6;

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gun no");
        }
    }
}
