package me01_Exercise;

import java.util.Scanner;

public class Z06_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
isimlerini yazdirin
Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
ilkHarf=S output = “Sali”
*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun isminin bas harfini giirniz");
        Character gun=scan.next().toLowerCase().charAt(0);
        if ((gun.equals('p'))) {
            System.out.println("pazartesi  \n pazar \n persembe");
        } else if ((gun.equals('s'))){
            System.out.println("sali");
            } else if (gun.equals('c')) {
            System.out.println("carsamba \n cuma \n cumartesi");
        }else {
            System.out.println("gecerli bir bas harf giriniz");


    }
    }
}
