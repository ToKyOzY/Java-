package me04_Exercises;

import java.util.Scanner;

public class Z01_Soru1 {
    public static void main(String[] args) {
       /*
        Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in

        palindrome olup olmadigini kontrol eden bir program yazin.

        */

         Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine();

      palindrome(kelime);


    }

    public static String palindrome(String kelime) {
        String sonuc="";
        for (int i =(kelime.length()-1); i >=0 ; i--) {
            sonuc += kelime.charAt(i);
        }
            if (sonuc.equals(kelime)){
                System.out.println("girdiğiniz kelime palindrome kelimedir");

            }else {
                System.out.println("girdiğiniz kelime palindrome değildir");
            }


        return sonuc;
    }
    }

