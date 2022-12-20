package day23_dateTime_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane string argumet yazarsam yazayim
        // Argumentlerin en uzun olanini yazdiran bir method olusturun
        // Not: en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin

        enUzunuYazdir("Ilyas", "Berivan", "Murat");
        enUzunuYazdir("Mehmet", "Vahit", "Nurcan", "Java","Zafer","Kerime");
    }

    private static void enUzunuYazdir(String ... isimler) {

        String enUzunKelime=isimler[0];
        for (String each: isimler){

            if (enUzunKelime.length()<each.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
