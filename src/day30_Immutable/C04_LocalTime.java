package day30_Immutable;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1); //06:32:13.786610500
        /*
        bizim olusturdugumuz date ve time canli date veya time dagildir
        localTime.naow kullandigimiz satiirda o anki tarih veya saati alip bizim
        variable'mizi store eder.
        time1 variable'in degeri sabittir.

         */

        Thread.sleep(3000);//bu codu yazinca 3 sn bekler sonra yazar

        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond()); //56

        System.out.println(time1.plusSeconds(1000)); //07:03:36.615539

        System.out.println(time1.withHour(3)); //03:48:18.007607700-->saati 3 yaparak yazdirdi

    }
}
