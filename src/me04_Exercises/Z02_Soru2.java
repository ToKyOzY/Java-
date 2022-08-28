package me04_Exercises;

import java.util.Scanner;

public class Z02_Soru2 {
    public static void main(String[] args) {
        /*kullanıcıdan pozitif bir rakam girmesini
        isteyin ve girilen rakama göre çarpım tablosu oluşturun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int rakam=scan.nextInt();
        int carpim=0;

        for (int i = 1; i <=10 ; i++) {
            carpim = rakam * i;


            System.out.println(rakam + "*" +i+ "=" + carpim);
        }

    }
}
