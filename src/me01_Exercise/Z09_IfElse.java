package me01_Exercise;

import java.util.Scanner;

public class Z09_IfElse {
    public static void main(String[] args) {
        /*
         Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase();
             if (gun.equals("cuma")){
                 System.out.println("Muslumanlar icin kutsal gun");
             } else if (gun.equals("cumartesi")) {
                 System.out.println("Yahudiler icin kutsal gun");
             } else if (gun.equals("pazar")) {
                 System.out.println("Hiristiyanlar icin kutsal gun");
             }else {
                 System.out.println("siradan bir gun");
             }
    }
}
