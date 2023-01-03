package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {

        /*
        Eger birfen fazla catch cumlemiz varsa ve exceptionlar arasinda parent chol iliskisi varsa

        1- ikisini de yazmak istiyorsak once child exception sonra parent yazilmalidir.
            aksi halde parent ustte olursa tum exceptionlari yakalacagi icin chol excp. yazmak anlamsiz olur.

         2- ikisini yazmak istemezsek sadece parent exceptinons yeterli olacaktir cunku parent daha kapsayicidir ve daha
         cok exceptions yakalar.
         */

        try {
            FileInputStream fis=new FileInputStream("src/day28_exceptions/metin.txt");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
