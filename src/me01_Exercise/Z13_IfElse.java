package me01_Exercise;

import java.util.Scanner;

public class Z13_IfElse {
    public static void main(String[] args) {
        /*
         Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
60 – 80.000 arasinda ise “Konusabiliriz”,
60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen arzu ettiğiniz maaşı giriniz: ");
        double maas= scan.nextDouble();

        if (maas>80.000){
            System.out.println("kabul ediyorum");

        } else if (maas>60.000 && maas<80.000) {
            System.out.println("konusabiliriz");
        } else {
            System.out.println("kabul edemem");

        }
    }
}
