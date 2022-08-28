package me01_Exercise;

import java.util.Scanner;

public class Z15_NestedIf {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 bassamkli bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5’e bölünen çift sayı");
            }else {
                System.out.println("5’e bölünen tek sayı");
            }

        } else   {
            System.out.println("tekrar deneyin");

        }

    }

}
