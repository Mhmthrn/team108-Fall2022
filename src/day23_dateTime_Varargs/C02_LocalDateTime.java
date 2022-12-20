package day23_dateTime_Varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);//2022-12-20T12:29:48.855351100

        ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-12-20T10:30:42.856298600

        System.out.println(ldt.getDayOfWeek());//TUESDAY

        System.out.println(ldt.withYear(2030));//2030-12-20T10:33:25.845601100


    }
}
