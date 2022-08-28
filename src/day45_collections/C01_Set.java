package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        verilen bir array'deki tekrar eden elementleri silip
        tekrarsiz halini array'e atayan code yaziniz

         */
        int[] arr={4,5,3,4,6,4,5,6,7,8,9,3,1,1,4,5,6,4,8};
        Set<Integer> tekrarsizSet=new HashSet<>();

        for (int each:arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet);


        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));

        int i=0;
        for (int each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println("Bizim Array'in son hali : "+Arrays.toString(tekrarsizArr));
    }
}
