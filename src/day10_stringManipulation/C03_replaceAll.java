package day10_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {


        // metindeki sayilardan kurtulun
        String str="Ja1va 56Guz,el-dir";
        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6","")); //Java Guz,el-dir

        /*
        replace methodu zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar

        eger genellemeyi butun sayilari, butun spaceleri , burun ozel karakterleri gibi genisletmek istersek
        replaceall () methodu kullaniriz

        \\d : tum digitler

         */
        str=str.replaceAll("\\d", "");
        System.out.println(str);// Java Guz,el-dir


        str=str.replaceAll(" ","7");
        System.out.println(str); //Java7Guz,el-dir


        // ozel karakterlerden de kurtulalim
        str=str.replaceAll("\\W","");
        System.out.println(str);//Java7Guzeldir

        str=str.replaceAll("\\d"," ");
        System.out.println(str);// Java Guzeldir

// karakter saysini bulun
        String input3="Ali Can, Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");

        System.out.println(input3.length());//22


    }
}
