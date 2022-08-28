package day03_scanner;

import java.io.SyncFailedException;
import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir önceki soruyu tk seferde kullanıcıdan tüm bilgileri alarak yapın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi, soyisminizi ve yaşınızı giriniz \n aralarda enter tuşuna basınız");

        String isim=scan.next();
        String soyIsim=scan.next();
        int yas= scan.nextInt();
        //girilen bilgiler =seyfi çapar 34 şeklinde yazdırın

        System.out.println("girilen bilgiler:" +isim  +soyIsim  + yas);

    }
}
