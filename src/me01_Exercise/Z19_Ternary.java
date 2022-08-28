package me01_Exercise;

import java.util.Scanner;

public class Z19_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        System.out.println(harf>='a'&& harf<='z' ? "kucuk harf": harf>='A' && harf<='Z' ? "buyuk harf":"girdiginiz karakter harf degil" );

    }
}
