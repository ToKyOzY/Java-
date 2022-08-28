package me05_Exercise;

import java.util.Scanner;

public class Z04_Soru {
    public static void main(String[] args) {
        /*
         Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayac=0;
        int top=0;
        do {
            System.out.println("lutfen pozitif sayi giriniz");
             sayi=scan.nextInt();
            if (sayi>0){
                sayac+=top;
                sayac++;
            }

            sayi++;
        }while (sayi!=0);

        System.out.println(sayac+" kadar pozitif tamsayı girdiniz \n girilen sayilarin toplami : "+top);

    }
}
