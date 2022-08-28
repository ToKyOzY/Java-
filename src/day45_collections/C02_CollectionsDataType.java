package day45_collections;

import java.util.*;

public class C02_CollectionsDataType {
    public static void main(String[] args) {
        /*
        collections <dataturu> nu object secmeniz durumunda
        collection'a farkli data turlerinden objeler koymamiza izin verir
        bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir
         */


        List<String> liste=new ArrayList<>();
        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List list=new ArrayList();//boyle yapildiginda java bunu object olarak kabul ediyor.. <Object> bu sekilde de yazilir
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list);
        list.set(0,(Integer)list.get(0)+5);
        System.out.println(list);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add('s');
        set1.add(true);
        set1.add("Ali");


    }
}
