package me01_Exercise;

import java.util.Scanner;

public class Z17_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int x= scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int y=scan.nextInt();
        System.out.println("kucuk olan: " +(x<y ? x:y));

    }
}
