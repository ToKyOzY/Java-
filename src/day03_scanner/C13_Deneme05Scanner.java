package day03_scanner;

import java.util.Scanner;

public class C13_Deneme05Scanner {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
//prizmanin hacmini hesaplayip yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin uzun kenarını giriniz.");
        double uzunKenar= scan.nextDouble();
        System.out.println("lütfen diktörtgenin kısa kenarını giriniz.");
        double kisaKenar= scan.nextDouble();
        System.out.println("lütfen dikdörtgenin yüksekliğini giriniz.");
        double yukseklik= scan.nextDouble();
        System.out.println(uzunKenar*kisaKenar*yukseklik);

    }
}
