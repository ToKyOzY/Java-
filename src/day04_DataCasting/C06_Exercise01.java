package day04_DataCasting;

import java.util.Scanner;

public class C06_Exercise01 {
    public static void main(String[] args) {
     int a1=23;
     int a2=34;
        System.out.println(a1+a2);
        System.out.println(a1*a2);
        System.out.println(a1-a2);

        int kisaKenar= 13;
        int uzunKenar=17;
        int cevre=(kisaKenar+uzunKenar)*2;
        int alan=kisaKenar*uzunKenar;
        System.out.println("dikdörtgenin çevresi:"+cevre);
        System.out.println("dikdörtgenin alani:"+alan);

        int b1=5;
        double b2=2.5;
        System.out.println(b1+b2);

        char use='b';
        System.out.println(use);
        int c1=6;
        System.out.println(use+c1);
        System.out.println(""+use+c1);

        String isim="zeynep";
        String soyisim= "sarıkaya";
        System.out.println(isim +soyisim);
        System.out.println("isminiz:"+isim);
        System.out.println("soyisminiz:"+soyisim);

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");
        String isimm= scan.next();
        System.out.println(isimm);



    }
}
