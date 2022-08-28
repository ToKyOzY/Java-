package me06_Practice;

public class Z02_Array {
    public static void main(String[] args) {
         /*
        Soru 2- Verilen String bir array’de en uzun ve en kisa
         String’leri yazdiran bir method olusturun
         */
        String[] isimler = {"ali", "ahmet", "zeynep", "rumeysa"};
        enuzun(isimler);
    }

    private static void enuzun(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];
        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime=isimler[i];

            }
        }

        System.out.println("en uzun kelime :"+enUzunKelime);
        System.out.println("en kisa kelime :"+enKisaKelime);

    }
}