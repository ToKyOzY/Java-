package me01_Exercise;

import java.util.Scanner;

public class Z02_IfElse {
    public static void main(String[] args) {
        /*
        kullanicidan bir karakter girmesini isteyin ve
        harf olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char a=scan.next().charAt(0);

        if (a>='A' && a<='Z'){
            System.out.println("girilen bir harftir");

        }else if (a>='a' && a<='z'){
            System.out.println("girilen bir harftir");

        }else {
            System.out.println("harf degildir");
        }

    }
}
