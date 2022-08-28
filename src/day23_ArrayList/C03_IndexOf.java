package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
        List<String > urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram")); //1
        System.out.println(urunler);

        /*
        indexOf methodu bize bilgi döndüren bir methoddur
        listemizi degiştirmez

         */


        System.out.println(urunler.lastIndexOf("ikram")); //1

        /*
        indexof method'u urunu aramya o indexten
        lastindexof method'u ise aramaya son indexten başlar

        arama bitip ürün bulundugunda
        ikiisi de bulunan ürünün indexini verir
         */

        urunler.add("ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));//1
        System.out.println(urunler.lastIndexOf("ikram"));//4

        System.out.println(urunler.indexOf("Hobby"));//-1
        System.out.println(urunler.lastIndexOf("Hobby"));//-1



    }
}
