package me01_Exercise;

import java.util.Scanner;

public class Z11_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz:");
        double x=scan.nextDouble();
        System.out.println("ikinci sayii giriniz");
        double y=scan.nextDouble();

        if (x>0 && y>0){
            System.out.println("sayilarin top: " +(x+y));
        } else if (x<0 && y<0) {
            System.out.println("sayilarin carpimi: " +x*y);
        } else if ((x<0 && y>0) || (y<0 && x>0)) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if (x==0 || y==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");

        }
    }
}
