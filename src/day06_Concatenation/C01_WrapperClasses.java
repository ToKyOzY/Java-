package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        wrapper class: javanın hazır metodlari kullanabilmemiz
         icin primitive
        data turlerinin her biri için açtığı class'lardır.
        int--->Integer
        char--->Character
        diğerleri pirimitive data turu ile ayni sadece bas harfi buyuk
         */

        String str= "Java ile hayat güzel";
        System.out.println(str.toUpperCase()); //JAVA İLE HAYAT GUZEL

        boolean guzelMi= true;
        // guzelMi  boolean primitive olduğundan hazır metodu bulunmuyor.
        //baş harfine dikkat et: küçükse primitive büyukse non_primitive

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE); //-32768 bu methodu lulanirsak en kucuk degerini veir
        System.out.println(Short.MAX_VALUE); //32767  en buyuk deger

        String ogrNo="123456";

        //kullanicidan bir sifre isteyin
        //eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlasi:" +(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi:"+(sifreSayi+3));
        /*
        Wrapper class'lar ilerde kullanabilecegimiz pek cok faydali hazir metod
        icerir.

         */



    }
}
