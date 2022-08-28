package me05_Exercise;

import java.util.Scanner;

public class Z01_Replit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dakika=scan.nextInt();
        dakikaYilBol(dakika);


    }
    public static void dakikaYilBol(int dakika){
        int yil=dakika/60/24/365;
        int gun=yil%365;

        System.out.print(dakika+" dakika yaklasik "+yil+ " yil "+gun+" gundur");
    }
}



