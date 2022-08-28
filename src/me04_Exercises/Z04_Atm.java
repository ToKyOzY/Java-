package me04_Exercises;

import java.util.Scanner;

public class Z04_Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "Lütfen yapmak istediginiz islemi giriniz.\n 1-Bakiye Sorgulama\n 2-Para Çekme\n 3-Para Yatırma \n4-Çıkış";

        double bakiye = 0;
        double paraCekme = 0;
        double paraYatirma = 0;

        boolean kapat = false;

        while (!kapat) {

            System.out.println(menu);
            int secim = scan.nextInt();

            if (secim == 1) {

                System.out.println("Bakiyeniz : " + bakiye);
            }

            if (secim == 2) {
                System.out.println("Hesabinizdan cekmek istediginiz tutari giriniz.");
                paraCekme = scan.nextDouble();
                System.out.println("Hesabinizda kalan bakiye : " + (bakiye - paraCekme) + "TL");

                if (secim == 3) {

                }
            }
        }
    }
}
