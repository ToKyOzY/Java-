package day24_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // verilen bir array'deki unique elementleri
        //yeni bir array olarak döndüren bir method olusturun

        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }

    private static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> benzersizList=new ArrayList<>();
        //yanindaki elemente esit olmayanlari listeye ekliyor
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                benzersizList.add(arr[i]);
            }

        }
        //son elementi kontrol edip yoksa listeye ekliyoruz
        if (benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }
        //benzersizListenin size bilgisini kullanarak bir array luşturdum
        //
        int[] tekrarsizArr=new int[benzersizList.size()];
        //benzersiz listedeki tum elemanlari yeni array'e atadik
        for (int i = 0; i <tekrarsizArr.length ; i++) {
            tekrarsizArr[i]=benzersizList.get(i);
        }
        //olusturdugumuz yeni array'i main method'a döndürdük
        return  tekrarsizArr;
    }
}
