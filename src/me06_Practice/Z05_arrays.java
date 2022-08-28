package me06_Practice;

import java.util.Arrays;

public class Z05_arrays {
    public static void main(String[] args) {
        //verilen bir array'e yeni bir element ekleyen method olusturun

        String[] sinifListesi={"Ali Can"};
        String eklenecekIsim="Murat Boz";

        sinifListesi=elemaniEkle(sinifListesi,eklenecekIsim);


    }

    private static String[] elemaniEkle(String[] sinifListesi, String eklenecekIsim) {

        String [] yeniSinifListesi=new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        System.out.println(Arrays.toString(yeniSinifListesi));

        return yeniSinifListesi;
    }
}
