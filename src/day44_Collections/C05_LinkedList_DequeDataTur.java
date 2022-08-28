package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTur {
    public static void main(String[] args) {
        Deque<String > ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);//en son kullanilan selim'i siler
        System.out.println(ll4.pop());//ilk elementi silip bize dönduruyor


        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        //Deque iki tarafli queue demektir
        //dolayisiyla her method'un firs ve last'i var


    }
}
