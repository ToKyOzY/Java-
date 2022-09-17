package day44_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {
        /*
        bir listedeki istenen sayi araliginda olmayan elementleri
        silen bir program yaziniz

         */
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);
        int basSinir=20;
        int bitSinir=40;

        ListIterator lit1= liste.listIterator();
        while (lit1.hasNext()){
            Integer temp=(Integer) lit1.next();
            if (temp<basSinir || temp>bitSinir){
                lit1.remove();
            }
        }
        System.out.println(liste);

    }
}
