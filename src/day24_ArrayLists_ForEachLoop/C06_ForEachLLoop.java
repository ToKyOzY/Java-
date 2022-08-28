package day24_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLLoop {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,56,9,7};
        List<Integer> liste=new ArrayList<>();
        
        //array'deki elemanlari inceleyelim tek sayi olanlari liist'e atayalim
        for (int each:arr //-> gelecek datalarin turu, loop icinde ne isim verdigim nereden aldigim
             ) {


            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
