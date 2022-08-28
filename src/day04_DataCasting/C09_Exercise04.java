package day04_DataCasting;

import java.util.Scanner;

public class C09_Exercise04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println(ilkHarf);
    }
}
