package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        eger bir class'in icerisinde herhangi bir hesplama yapip bunu
        da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin islemi bir methodda yapin
        sonucunu main method'a döndürmeliyiz
        return type'i void
         */

        /*
        kullanicidan sehir ismini ve dogum tarihini alin
        bunlari programda kullanacagimiz formatta bize donduren bir
        method olusturun
        sehir ismini programimizda buyuk harf olarak
        tarihi ise 2022_06_30 seklinde kullanmak istiyoruz

         */
        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("girdiginiz sehir :" + sehir);
        System.out.println("girdiginiz tarih :" + tarih);

    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriiniz");
        int yil = scan.nextInt();

        if (yil > 1900 && yil < 2100) {
            tarih = yil + " -";
        } else {
            System.out.println("gecerli bir sayi yaziniz");
        }

        System.out.println("kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay = scan.nextInt();

        if (ay < 0 || ay > 12) {
            System.out.println("ay no 1-12 arasinda olmalidir");

        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";

        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("gun no olarak 1-31 arasinda olmalidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;

        } else {
            tarih = tarih + gun;

        }

        return tarih;
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("sehir ismi giriniz");
        String sehirAdi = scan.next().toUpperCase();

        return sehirAdi;
    }
}
