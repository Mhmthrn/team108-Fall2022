package day28_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {
        /*
        Eger birden fazla exceptions olusma ihtimali varsa bu exceptions larin birbirinden bagimsiz ise

            1- tek try istenen kadar catch yapilabilir
            2- ikisi icin ic ice try catch yapabilirim
            3- iki exceptionu da kapsayan tek bir catch yapabilirim

         */

      String str="Java'da cok fazla exceptions var.";
      int [] arr ={3,5,1,3,2,6,3,6,8,5,2};

      // Kullanicidan bir tamsayi alin ve girilen sayiyi index oalrak kullanip str ve arr de o indexdeki elementleri
        // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index girin");
        int index=scan.nextInt();

        //System.out.println("String'den istenen index deki element : "+ str.substring(index,index+1));
       // System.out.println("Arrayde istenen index deki element : "+ arr[index]);



        //1. Cozum
       /* try{
            System.out.println("String'den istenen index deki element : "+ str.substring(index,index+1));
            System.out.println("Arrayde istenen index deki element : "+ arr[index]);

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Istenen index Stringin sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Istenen index arrayin sinirlari disinda");
        }*/

        //2. Cozum ic ice try catch

        /*try {
            try {
                System.out.println("String'den istenen index deki element : "+ str.substring(index,index+1));
                System.out.println("Arrayde istenen index deki element : "+ arr[index]);

            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Istenen index Stringin sinirlari disinda");

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istenen index arrayin sinirlari disinda");
        }*/

        //3- Cozum tek ama daha kapsamli bir exceptions kullanmak

        try {
            System.out.println("String'den istenen index deki element : "+ str.substring(index,index+1));
            System.out.println("Arrayde istenen index deki element : "+ arr[index]);
        } catch (RuntimeException e) {
            System.out.println("index String ve/veya Array'in sinirlari disinda");

            e.printStackTrace();

        }


    }
}
