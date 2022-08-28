package day03_scanner;

import java.util.Scanner;

public class C12_Deneme04Scanner {
    public static void main(String[] args) {
        // Soru2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen karenin kenar uzunluğunu giriniz.");
        double kenar= scan.nextDouble();
        System.out.println("karenin çevrei:"+kenar*4);
        System.out.println("karenin alanı:"+kenar*kenar);


    }
}
