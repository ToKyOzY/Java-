package day30_Immutable;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat); //2022-08-01T06:56:09.979149400

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2022-11-05T10:57:37.993544

        System.out.println(tarihSaat.minusDays(100).minusMinutes(100));

        System.out.println(tarihSaat.getDayOfWeek());//MONDAY

        System.out.println(tarihSaat.toLocalDate());//2022-08-01



    }
}
