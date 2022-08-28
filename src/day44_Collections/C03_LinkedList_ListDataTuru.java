package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String > ll1=new LinkedList();

        List<String > ll2=new LinkedList();
        Queue<String> ll3=new LinkedList();
        Deque<String > ll4=new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);
        System.out.println(ll2.remove(3));//Ayse
        //eger listemiz int elementlerden olusuyorsa
        //direkt sayiyazarsak index olarak kabul eder
        //bir variable'a atama yapar ve remove'da o variabkle'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal"));//false
        System.out.println(ll2.isEmpty());//false

        ll2.set(1,"serap");
        System.out.println(ll2);//[Berk, serap, Enes]
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);
        ll2.retainAll(ll1); //ll2 deki ntum elementleri ll1 ile karsilastirir
                            //ll1 de olmayanlari siler

        System.out.println(ll2);

        System.out.println(ll2.hashCode());//2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode());//131726141


    }
}
