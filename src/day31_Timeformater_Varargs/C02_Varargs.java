package day31_Timeformater_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen 2 int'i toplayip sonucu yazdiran bir method olustur

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("verilen dort sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));

    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen uc sayinin toplami : "+(sayi1+sayi2+sayi3));


    }

    private static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("verilen iki sayinin toplami : "+(sayi1+sayi2));

    }
}
