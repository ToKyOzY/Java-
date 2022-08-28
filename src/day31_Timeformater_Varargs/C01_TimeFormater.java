package day31_Timeformater_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormater {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " +tarihSaat);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm s");

        System.out.println(dtf.format(tarihSaat));//01/8/22 07:43 46

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm s");


        System.out.println(dtf2.format(tarihSaat));//1/Aug/2022 07:43 46
    }
}
