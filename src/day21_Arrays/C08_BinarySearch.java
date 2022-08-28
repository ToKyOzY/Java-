package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binarry Search java'da eleman armanin kisa yoludur
        ancak binary search'un calisması icin önce Array'in sirali hale getirilmesi gerekir
        eger siralama yapmadan binary search yaparsaniz sonuu bulamayabilir veya
        yanlis bulabilir
         */

        String [] harfler={"y","b","d","g","o"};
        String arananHarf="y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_ContainsArrays.contains(harfler,arananHarf));

        //binarysearch bize aradigimiz elemanin index'ini döndürüyor
        //array sirali olmaddigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }
}
