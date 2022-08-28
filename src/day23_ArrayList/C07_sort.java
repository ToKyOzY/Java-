package day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String > urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);

        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]
        /*
        list ile gelen sort method'unda sıralama özelliğini girmek gerekiyor
        bunun yerine collections class'ından sort method'unu kullanıyoruz
        bu method listemizi naturel order'a göre sıralar
         */

    }
}
