package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {
        /*
        kullanıcıdan toplanmak üzere sayılar alın
        sayıların toplamı 500'ü geçince
        sayıların toplamını ve kaç sayı toplandıgını
        şu şekilde yazdırın

        13 sayı girdiniz ve toplamları 567
         */

        int top=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);


        while (top<500){

            System.out.println("lutfen toplamak için sayıları girin");
            sayi=scan.nextInt();
            top+=sayi;
            sayac++;

        }
        System.out.println(sayac+" sayı girdiniz ve toplamları "+ top);


    }
}
