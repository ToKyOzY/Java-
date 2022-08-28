package me01_Exercise;

import java.util.Scanner;

public class Z04_IfElse {
    public static void main(String[] args) {
        /*
        kullanicidan bir ucgenin uc kenar uzunlugunu
        alin eger uc kenar uzunlugu esit ise consola"eskenar ucgen"
        diger durmlarda "eskenar degil" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin bir kenar uzunlugunu giriniz");
        double x=scan.nextDouble();
        System.out.println("lutfen ikinci kenar uzunlugunu giriniz");
        double y=scan.nextDouble();
        System.out.println("lutfen ucuncu kenar uzunlugunu giriniz");
        double z=scan.nextDouble();
        if (x==y && y==z){
            System.out.println("eskenar ucgendir");
        }else {
            System.out.println("eskenar degildir");
        }

    }
}
