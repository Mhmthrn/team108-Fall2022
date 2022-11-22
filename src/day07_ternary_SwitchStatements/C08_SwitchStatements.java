package day07_ternary_SwitchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {


        int sayi1=20;
        int sayi2=10;
        char islem='*';

        //if else ile

        if (islem=='+'){
            System.out.println("Sayilarin toplami :"+ (sayi1+sayi2));
        }else if (islem=='-'){
            System.out.println("Sayilarin fasrki :"+(sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("Sayilarin Carpimi :"+ (sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("Sayillarin bolumu"+sayi1/sayi2);
        }else{
            System.out.println("yanlis islem tercihi");
        }

        System.out.println("======================");


        // Switch statement ile yapalim

        switch (islem){

            case  '+':
                System.out.println("Sayilarin toplami :"+ (sayi1+sayi2));
                break;
            case '-':
                System.out.println("Sayilarin fasrki :"+(sayi1-sayi2));
                break;
            case '*':
                System.out.println("Sayilarin Carpimi :"+ (sayi1*sayi2));
                break;
            case '/':
                System.out.println("Sayillarin bolumu"+sayi1/sayi2);
                break;
            default:System.out.println("yanlis islem tercihi");


        }



    }
}
