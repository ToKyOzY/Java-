package day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        binarySearch method'u siralamis array'de aradiginiz elementin
        index'ini döndürür

        ya aradigimiz element array'de yoksa
        (String'de indexof bize olmayan elementler icin -1 döndürüryordu)

        aradigimiz element array'de yoksa java hem
        olmadigini hem de olsaydi nerede olacagini bize döndürür

        olmadigini ifade icin - kullanir
        olsaydi nerede olacagini belirtmek icin index degil siralama kullanir



         */

        int[] sayilar={3,5,15,4,27,6};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        //varsa index yoksa sira

        System.out.println(Arrays.binarySearch(sayilar,1));//-1
        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//3
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1

    }
}
