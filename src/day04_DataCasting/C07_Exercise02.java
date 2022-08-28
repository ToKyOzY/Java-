package day04_DataCasting;

import java.util.Scanner;

public class C07_Exercise02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");
        String name= scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz:");
        String surName= scan.nextLine();
        System.out.println("isminiz:"+name);
        System.out.println("soyisim:"+surName);
    }
}
