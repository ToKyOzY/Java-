package me01_Exercise;

import java.util.Scanner;

public class Z14_IfNestedIfElseSifre {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen şifrenizi giriniz");
        String siff=scan.nextLine();

        char sifre = siff.charAt(0);

        if (sifre >= 'A' && sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else if (sifre >= 'a' && sifre <= 'z') {
            if (sifre == 'z') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else {
            System.out.println("lutfen gecerli bir sifre giriniz");
        }
    }

    }

