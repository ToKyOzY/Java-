package me01_Exercise;

import java.util.Scanner;

public class Z12_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 100 uzerinden bir sayi girniz");
        int sayi= scan.nextInt();

        if (sayi<0 || sayi>100){
            System.out.println("gecerli bir not giriniz");
        }else if (sayi<50){
            System.out.println("harf notu: " + "D");
        } else if (sayi>50 && sayi<60) {
            System.out.println("harf notu: "+"C");
        } else if (sayi>60 && sayi<80) {
            System.out.println("harf notu: "+ "B");
        } else {
            System.out.println("harf notu: "+ "A");
        }
    }
}
