package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        1- verilen sayi1 ve sayi2 variable'larının
         değerlerini değiştiren (SWAP)
         bir program yazınız
         örn: sayi1=10 ve
         sayi2=20
         kod çalıştıktan sonra
         sayi1=20 ve
         sayi2=10
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        //sayi3 geçici kovamız
        //adım1- sayı2 yi boş kovaya koyalım

        sayi3 = sayi2;  //  10  20   20

        // adım2- 1. sayıyı 2. sayıya atayacağız.

        sayi2 = sayi1; //    10   10   20

        //adım3- boş kovadaki sayıyı sayı1 e atayalım

        sayi1 = sayi3;  //   20   10   20
        System.out.println("swaptan sonra sayi1: " + sayi1); //20
        System.out.println(" swaptan sonra sayi2:" + sayi2); //10
    }
}
