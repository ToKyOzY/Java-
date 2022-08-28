package dayy03_prctise02;

import java.util.Scanner;

public class Q04_StringManip {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini
        // isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyismiinizi giriniz ");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyIsim=scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizden uzundur");

        }else if (isim.length()==soyIsim.length()){
            System.out.println("isminiz soyisminizle esit uzunlukta");
        }else
            System.out.println("soyisminiz isminizden uzun");
    }
}
