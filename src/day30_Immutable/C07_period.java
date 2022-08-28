package day30_Immutable;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {
    public static void main(String[] args) {
        //iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1985,10,8);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);

        System.out.println(period);

        System.out.println(period.getYears());

    }
}
