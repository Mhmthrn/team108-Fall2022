package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s=20;
        System.out.println(s);//20

        // int s=30;
        // bir scope de tanimlanan variablenin yeniden tanimlama imkani yoktur.
        // data turunu degistirirrek yeniden tanimlamak da mumkun degildir.Cunku, kullanirken
        // variablenin ismini yazdigimizda hangi sayi variablesini kullanacagi mechul olur.
        method1();
    }
    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase());// hasan
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
