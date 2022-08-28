package me06_Practice;

public class Z01_ArrayList {
    public static void main(String[] args) {
/*
        Soru 1- Verilen bir int array’deki
         en buyuk sayiyi yazdiran bir method olusturun.
         */

        int[]sayilar={1,2,3,4,5,6};

        maxSayiYazdir(sayilar);






    }

    private static void maxSayiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {
            maxSayi=sayilar[i];
        }

        System.out.println("arrayin max deeri :"+maxSayi);


    }
}
