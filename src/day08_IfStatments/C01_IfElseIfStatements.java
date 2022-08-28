package day08_IfStatments;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan gun ismini yazmasını isteyin. girilen isim gecerliyse
        ismiinin 1.2.3. harflerini ilk harf buyuk
        diger ikisi kucuk olarak yazdirin, gun ismi gecerli degilse
        "gecerli gun ismi giriniz" yaziniz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lufen gun ismini giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("paz");
        } else if (gun.equals("sali")) {
            System.out.println("sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("car");
        } else if (gun.equals("persembe")) {
            System.out.println("per");
        } else if (gun.equals("cuma")) {
            System.out.println("cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("cumr");
        } else if (gun.equals("pazar")) {
            System.out.println("pazr");
        } else {
            System.out.println("lufen gecerli bir gun giriniz");

        }
    }
}