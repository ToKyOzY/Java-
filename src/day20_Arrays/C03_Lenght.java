package day20_Arrays;

public class C03_Lenght {
    public static void main(String[] args) {

        //iki sekilde array olusturabiliriz
        int sayilar[]={1,2,3}; //direkt arrays'leri yazdırıyorsak curly brayse {

        String harfler[]=new String[4]; //uzunlugu soyleyerek yapıyorsak koseli

        System.out.println("sayilar array'inin uzunlugu : "+sayilar.length);
        //String length method'unda parantez var Array'de yok

        System.out.println("harfler Array'inin uzunlugu : "+harfler.length);


        //harfler array'inin son elementini yazdıralım
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); //

    }
}
