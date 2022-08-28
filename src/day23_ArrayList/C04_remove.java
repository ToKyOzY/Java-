package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String > urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /*
        remove method'u iki şekilde kullanır
        1- objeyi yazıp silmesini istersek bize boolean sonuc döner
        2- index girersek o index'teki elemanı siler bize silinen elemanı döndürür

         */
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram")); //true
        System.out.println(urunler);//[nutella, cekirdek, cay]

        System.out.println(urunler.remove("Hobby")); //false
        System.out.println(urunler);//[nutella, cekirdek, cay]

        //2i yöntemi deneyelim yani index girelim

        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);

        //olmayan indexi silmeye çalışırsak ?
        //System.out.println(urunler.remove(3));
        //IndexOutOfBoundsException


    }
}
