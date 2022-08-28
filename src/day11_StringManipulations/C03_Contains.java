package day11_StringManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        /*
        Soru 1) Kullanicidan email adresini
        girmesini isteyin, mail @gmail.com
        icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz
        kaydedildi “ , @gmail.com ile bitmiyorsa lutfen
        yazimi kontol edin yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresi giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
