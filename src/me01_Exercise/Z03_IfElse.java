package me01_Exercise;

import java.util.Scanner;

public class Z03_IfElse {
    public static void main(String[] args) {
        /*
        kullaniciya yasini soun eger yas 65'den kucukse
        "emekli olamazsin",
        65'den buyukse "emekli olabilirsin" yazdirib
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin");

        }else if (yas>=65){
            System.out.println("emekli olabilirsin");
        }
    }
}
