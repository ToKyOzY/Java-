package day17_NestedForLoop;

import java.util.Scanner;

public class C09_whileLoop {
    public static void main(String[] args) {

        /*
        soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve başarılı şifre girinceye kadar tekrar şifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */

        Scanner scan=new Scanner(System.in);

        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;

        while (!sifreBasariliMi){
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            //4 kontrolu yapalım
            //her gecen kontrol için kontrol variable'ını bir arttıralım

            if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
                kontrol++;
            }else {
                System.out.println("ilk harf buyuk harf olmali");

            }
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else {
                System.out.println( "son harf kucuk harf olmali");
            }
            if (!sifre.contains(" ")){
                kontrol++;
            }else {
                System.out.println("sifre bosluk icermemeli");
            }
            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("sifre en az 8 karakter olmali");
            }
            if (kontrol==4){
                System.out.println("sifreniz basarıyla kaydedildi");
                sifreBasariliMi=true;
            }else { //sifre basarisiz tekrar basa donecek
                    // kontrol variable'ı sıfırlanmalı
                kontrol=0;
            }


        }


    }
}
