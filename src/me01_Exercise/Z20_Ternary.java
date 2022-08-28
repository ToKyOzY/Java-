package me01_Exercise;

import java.util.Scanner;

public class Z20_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere
gore dikdorgenin kare olup olmadigini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kisa kenari giriniz");
        double a=scan.nextDouble();
        System.out.println("uzunkenari giriniz");
        double b=scan.nextDouble();
        System.out.println(a==b ? "karedir": "dikdortgendir");


    }
}
