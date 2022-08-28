package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan iki tane sayı alıp
         bu sayıların çarpımını yazdırın.
         */
    //1. adım
        Scanner scan= new Scanner(System.in);

     //2. adım
        System.out.println("lütfen ilk sayıyı giriniz.");

     //3. adım
        double sayi1= scan.nextDouble();

      //2. sayı için 2. ve 3. adımları tekrarlayınız
        System.out.println("lütfen ikinci sayıyı giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayıların çarpımı:" +sayi1*sayi2);
    }

}
