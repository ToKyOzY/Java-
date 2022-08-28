package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        elmizde urunlerin bulundugu bir liste var
        ürün listesindeki istenen sıradaki ürünü
        istediğimiz yeni ürünle değiştirip
        eski ürünü varolan yeni ürünler listesine ekleyelim

         */
        List<String > urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String> eskiUrunler=new ArrayList<>();
        //listedeki ikram'ın yerinebiskrem koyalım
        //ikram'ı da eski ürünler listesine ekleyelim

        String yeniUrun="biskrem";
        String silinenUrun="ikram";

        int temp=urunler.indexOf(silinenUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("ürünler listesi :"+urunler);
        System.out.println("eski ürünler listesi : "+eskiUrunler);









    }
}
