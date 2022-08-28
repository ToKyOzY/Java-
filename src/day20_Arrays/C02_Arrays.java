package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        System.out.println(sayilar); //[I@3ac3fd8b ==> referans
        // non primitive data turundeki datalari
        // her zaman direkt yazdiramayabiliriz
        //array'i yazdirmak istersek java'daki arrays class'ından yardim isteriz
        System.out.println(Arrays.toString(sayilar)); //[0,0,0,]
        //bir array'i yazdirmak istiyorsak bu şekilde yukardaki gibi yazdirabiliriz

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar); //[I@3ac3fd8b
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10]

        String siniflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniflist)); //{Ali ,Ayse,Ahmet}

        siniflist[1]="Hasan";

        System.out.println(Arrays.toString(siniflist));


        System.out.println(siniflist[1]);//hasan'ı yazdıralım
        System.out.println(siniflist[0]);//Ali


    }
}
