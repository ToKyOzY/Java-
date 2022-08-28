package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //kullanicidan bir say, alin. sayi pozitifse"sayi pozitif"
        //yazdirin negatifse  sayinin karesini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("ltfen bir sayi giriniz");
        double sayi= scan.nextDouble();

         //eger ternary icindeki sonuclar farkli data turlerinde ise
        //atama yapamayiz sadece yazdirabiliriz.
           //double sayi>0 ? "sayi pozitif" :(sayi+sayi);

        System.out.println(sayi>0? "sayi pozitif" :(sayi+sayi));
    }
}
