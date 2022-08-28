package day24_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_ForEachLoop {
    public static void main(String[] args) {
        /*
        2 string array olusturup,bu array'deki ortak elemanlari
        for-each Loop kullanarak bulup, yazdirin
        ortak eleman yoksa ekrana "ortak eleman yok" yazdirin
         */
        String[] arr1= {"Ali", "Veli", "Can", "Ayse"};
        String[] arr2={"Ali","Hassan","Ayse","Enes"};

        List<String> ortakIsimler=new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }

        }
        if (ortakIsimler.isEmpty()){
            System.out.println("hic ortak eleman yok");
        }
        System.out.println("her iki array'deki ortak isimler :" +ortakIsimler);
    }
}
