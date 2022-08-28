package me01_Exercise;

import java.util.Scanner;

public class Z07_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek: gun=Pazar output = “Hafta sonu”
gun=Sali output = “Hafta ici”
*** String icin equals method’unu kullanin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma") ){
            System.out.println("haftaici");
        } else if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("haftasonu");
        }else {
            System.out.println("gecerli bir gun giriniz");
        }

    }
}
