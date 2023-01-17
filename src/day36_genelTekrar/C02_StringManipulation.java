package day36_genelTekrar;

public class C02_StringManipulation {
    public static void main(String[] args) {
        /*
        Verilen bir cumlede istenen kelimenin kac kere gectigini bulup
        yazdiran bir method olusturun.
         */
        String cumle="Java basladi ve bitti. Java meger ne guzelmis.Ne phyton ne C, Java en iyisi";
        String istenenKelime="Java";

       // kullanimSayisiBul1(cumle,istenenKelime);

        //kullanimSayisiBul2(cumle,istenenKelime);

        kullanimSayisiBul3(cumle,istenenKelime);
    }

    private static void kullanimSayisiBul3(String cumle, String istenenKelime) {
        /*
        Java buldikca silerek yapildi
        ama JaJavava varsoburadan 2 hava buluyor.""  yerine - kullandik ve sorun cozuldu
         */

        int kullanimSayisi=0;

        while (cumle.contains(istenenKelime)){
            if (cumle.contains(istenenKelime)){
                kullanimSayisi++;
                cumle=cumle.replaceFirst(istenenKelime, "-");
            }
        }
        if (kullanimSayisi==0){
            System.out.println("Aranan kelime cumlede yoktur.");
        }else {
            System.out.println("Kelime cumlede "+kullanimSayisi +" adet kullanilmistir.");
        }


    }

    private static void kullanimSayisiBul2(String cumle, String istenenKelime) {
        // for loop ve substring ile yapalim
        int kullanimSayisi=0;

        for (int i = 0; i <=cumle.length()-istenenKelime.length() ; i++) {

            if (cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime)){
                kullanimSayisi++;
            }


        }

        if (kullanimSayisi==0){
            System.out.println("Aranan kelime cumlede yoktur.");
        }else {
            System.out.println("Kelime cumlede "+kullanimSayisi +" adet kullanilmistir.");
        }

    }

    private static void kullanimSayisiBul1(String cumle, String istenenKelime) {
        int kullanimSayisi=0;
        int index=0;

            while (index<cumle.length()){

                index= cumle.indexOf(istenenKelime,index);
                if (index==-1){
                    if (kullanimSayisi==0){
                        System.out.println("Cumlede aranan kelime yok");
                        break;
                    }else {
                        System.out.println("Kelime cumlede "+kullanimSayisi +" adet kullanilmistir.");
                        break;
                    }

                }else {
                    kullanimSayisi++;
                    index++;
                }
            }


    }

}
