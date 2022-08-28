package me02_Exercise;

import java.util.Scanner;

public class Z08_StringManipulations {
    public static void main(String[] args) {

         /*
        Soru 1) Kullanicidan email adresini
        girmesini isteyin, mail @gmail.com
        icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz
        kaydedildi “ , @gmail.com ile bitmiyorsa lutfen
        yazimi kontol edin yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("email adresinizi giriniz");
        String mail = scan.nextLine().toLowerCase();

        if (!mail.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresi giriniz");

        } else if (mail.lastIndexOf("@gmail.com")==(mail.length()-10)) {
            System.out.println("email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
