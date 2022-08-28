package me04_Exercises;

import java.util.Scanner;

public class Z11_Soru {
    /*
    ) Kullanicidan baslangic ve bitis haflerini alin ve
     baslangic harfinden baslayip bitis
harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
 Kullanicinin hata yapmadigini farz edin
     */
    public static void main(String[] args) {
       char bas='a';
       char bit='z';
       Character temp=bas;
       while (temp<=bit){
           System.out.print(temp.toUpperCase(temp)+" ");

            temp++;
        }
    }
}
