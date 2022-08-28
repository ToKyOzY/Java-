package day05_Matematikselİslemler;

import java.util.Scanner;

public class C03_ModulusRakamlarToplami {

    public static void main(String[] args) {
        // kullanıcıdan 4 basamaklı bir tamsayı alın
        //ve rakamlar toplamını bulup yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();  //5267

        int birlerBasamagı = 0;
        int rakamlarToplamı = 0;
        int ilkGirilenSayi = sayi;

        //şuanda sayı 5267 bb:0 rt:0

        birlerBasamagı = sayi % 10; // 7
        rakamlarToplamı += birlerBasamagı;
        sayi /= 10;

        //şuanda sayi: 526 bb:7 rt :7

        birlerBasamagı = sayi % 10; //6
        rakamlarToplamı += birlerBasamagı; //7+6=13
        sayi /= 10;

        //şuanda sayı52 bb:6 rk:13

        birlerBasamagı = sayi % 10; //2
        rakamlarToplamı += birlerBasamagı; //13+2=15
        sayi /= 10;

        //şuanda sayi 5 bb: 2 rt:15

        birlerBasamagı = sayi % 10;//5
        rakamlarToplamı += birlerBasamagı; //15+5=20
        sayi /= 10;

        //şuanda sayi: 0 bb:5 rt:20

        System.out.println(ilkGirilenSayi + " sayının rakamlar toplamı : " + rakamlarToplamı);


    }
}
