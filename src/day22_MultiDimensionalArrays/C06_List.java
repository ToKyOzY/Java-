package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol [] idi.
        arrayList'de is diamond <> kullaniriz
         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler); // []

        // bir List'e eleman eklemek istersek
        isimler.add("basak");

        System.out.println(isimler.add("ayse")); //true döner

         /*
         String'de bir method çalıştırdıgımızda assign ypmazsak
         String değişmiyordu

         String isim="Suleyman";
         isim.toUpperCase(); //sadece bu satır için oluyordu SULEYMAN
         sout(isim)--->Suleyman olurdu

          */
        System.out.println(isimler);// {basak, ayse}

        /*
        List'i tek kötü tarafı Aray alt yapısını kullandıgı için elemanları birer birer
        eklemek zorunda olmamızdır.
         */


    }
}
