package day03_scanner;

import java.util.Scanner;

public class C11_Deneme03 {
    public static void main(String[] args) {
        // Soru1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);


    }
}
