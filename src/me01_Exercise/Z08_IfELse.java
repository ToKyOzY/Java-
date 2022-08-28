package me01_Exercise;

import java.util.Scanner;

public class Z08_IfELse {
    public static void main(String[] args) {
        /*
         Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
olmadigini yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kisa kenarini giriniz");
        double a= scan.nextDouble();
        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        double b= scan.nextDouble();

        if (a==b){
            System.out.println("karedir");

        } else if (a<b) {
            System.out.println("dikdortgendir");
        }else
            System.out.println("gecerli bir sayi giriniz");


    }
}
