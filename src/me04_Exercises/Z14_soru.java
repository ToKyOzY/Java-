package me04_Exercises;

import java.util.Scanner;

public class Z14_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
         toplam kac tane olduklarini ekranda yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        int sayac = 0;
        int bolenler = 1;

        while (bolenler <= sayi) {
            if (sayi % bolenler == 0) {
                System.out.print(bolenler + " ");
                sayac++;
            }
            bolenler++;


        }
        System.out.print("");
        System.out.println("\n"+sayi + " sayısının " + sayac + " tene boleni vardır");


    }
}
