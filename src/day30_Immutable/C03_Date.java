package day30_Immutable;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih); //2022-08-01

        System.out.println(tarih.getDayOfYear()); //213
        System.out.println(tarih.getDayOfWeek()); //MONDAY
        System.out.println(tarih.getMonthValue()); //8
        System.out.println(tarih.isLeapYear()); //false

        LocalDate tarih2=LocalDate.of(1985,8,10);
        System.out.println(tarih2);

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY,3);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100)); //2022-11-09

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); //2027-11-13

        System.out.println(tarih.minusMonths(20)); //2020-12-01

        System.out.println(tarih.minusYears(4).minusMonths(3).minusDays(15)); //2018-04-16

        System.out.println(tarih.isAfter(tarih2)); //true
        
        //iki farkli dogum gunu girildiginde
        //hangisinde doganin daha buuk oldugunu bulun
        //tarih2 ve tarih3 icin bunu yapalim
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+ " tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+" tarihinde dogan daha buyuk");
        }else {
            System.out.println("iki tarih birbiriyle ayni");
        }

    }

}
