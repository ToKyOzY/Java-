package day39_Exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        soru: kullan,icidan yasini girmesini isteyin
        code2unuzu kullanici sifirdan kucuk bi sayi girerse
        Exception verecek sekilde yazin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi girirniz");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("yasiniz :"+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("yas negatif olamaz");//err-->kirmizi yazar

        }
    }
}
