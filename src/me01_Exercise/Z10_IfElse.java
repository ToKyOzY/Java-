package me01_Exercise;

import java.util.Scanner;

public class Z10_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
gecerli degilse “Gecerli gun ismi giriniz” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase();

        if (gun.equals("pazartei") || gun.equals("pazar")){
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma") || gun.equals("cumartesi")) {
            System.out.println("Cum");
        }else {
            System.out.println("gecerli bir gun giriniz");
        }
    }
}
