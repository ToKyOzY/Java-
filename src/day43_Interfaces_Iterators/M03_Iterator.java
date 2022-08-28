package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        //liste'deki tum elementleri index kullanmadan 3 arttirin

        for (Integer each:liste
             ) {
            System.out.println(each+3+" ");
        }
        System.out.println("");
        System.out.println(liste);

        /*
        Java index yapisi olmaya collection'lardaki
        elementlere ulasmak veya degistirmek icin
        Iterator interfaceîni olusturtmustur

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iteratıor donduren liste.iterator() method'unu kullaniriz
         */


        System.out.println(liste);//[10, 20, 30]

        Iterator it1= liste.listIterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//30'dan sonra element kalmadigindan next() RTE verir

        //Iterator'da geri donus yok. adim adim sona yaklastiktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmamiz gerekir

        Iterator it2= liste.listIterator();
        //yeni it2'yi kullanarak listenin tum elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);//ıterator ile elementleri gezip remove yapinca
                                    //liste kalici olarak degisti
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);

        Iterator it3=liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste : "+liste);

        /*
        goruldugu gibi Iterator kullanarak yapabildigim
        1-tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        bu da bize yetmez
         */



    }
}
