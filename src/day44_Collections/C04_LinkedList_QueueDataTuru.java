package day44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        //Queue kuyruk demketir sira onemlidir
        //gelen sona gelir, giden bastan gider

        System.out.println(ll3);//[Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove());//Adem

        System.out.println(ll3);//[Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat"));//true

        System.out.println(ll3);//[Zeynep, Kadir]

        System.out.println(ll3.element());//Zeynep
        System.out.println(ll3.peek());//Zeynep

        Queue<String > ll4=new LinkedList<>();
        //System.out.println(ll4.element());// throws exception
        System.out.println(ll4.peek());//null
        /*
        peek ve element silmeden elementi bize dondurur
        arlarindakş fark bos liste olursa peek null doner,
        element exception firlatir
         */
        ll3.offer("Ahmet");
        ll3.offer("Sefa");
        System.out.println(ll3);

        System.out.println(ll3.poll());
        System.out.println(ll3);
    }
}
