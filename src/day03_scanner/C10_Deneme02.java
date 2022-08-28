package day03_scanner;

import java.util.Scanner;

public class C10_Deneme02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi,soyisminizi ve yaşınızı giriniz\n aralarda entera basınız");
        String isim=scan.nextLine();
        String soyIsim= scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("girilen bilgiler: "+ isim +" ,"+soyIsim+","+ yas);
    }
}
