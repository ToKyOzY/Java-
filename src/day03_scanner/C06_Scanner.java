package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan ismini ve soyismini alıp
        girilen bilgiler =seyfi çapar 34 şeklinde yazdırın
         */
    Scanner scan=new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        /*
        string verileri scanner ile alırken
        nevt() :ilk boşluğa kadar olan kısmı (ilk kelime)alır
        nextline() :satırın somuna kadar ne yazarsk alır.
        Not: ardarda birden fazla kelime yazılacaksa nevtline kullanılmalıdır.
         */
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();
        //girilen bilgiler =seyfi çapar 34 şeklinde yazdırın
        System.out.println("girilen bilgiler:" +isim  +soyIsim  + yas);
    }
}
