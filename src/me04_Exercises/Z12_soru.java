package me04_Exercises;

public class Z12_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
yazdirin. Kullanicinin hata yapmadigini farz edin.
Ornegin kullanici 3 girerse;
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */
        int input=5;
        int temp=1;
        while (temp<=10){
            System.out.print(input+"x"+temp+"="+input*temp+" ");
            temp++;

        }
        System.out.println("");
        for (int i = 1; i <=10 ; i++) {

            System.out.print(input+"x"+i+"="+input*i+" ");



        }
        System.out.println("");
    }
}
