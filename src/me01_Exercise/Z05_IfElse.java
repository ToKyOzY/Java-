package me01_Exercise;

import java.util.Scanner;

public class Z05_IfElse {
    public static void main(String[] args) {
        /*
        kullnicidan bir tamsayi isteyin ve sayinin tek veya
        cift oldugunu tyazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("cifttir");

        }else {
            System.out.println("tektir");
        }
    }
}
