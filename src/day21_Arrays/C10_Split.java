package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        split method'u bir array methodu degil string method'udur.
        ama array döndürdüğü için bu konuda anlatıyoruz

         */

        String str="Java ne kadar guzel";
        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        
    }
}
