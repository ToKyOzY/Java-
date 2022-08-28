package day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {
        int[] sayilar={5,7,6,4,3,9};

        // Arrays class'ini kullanarak natural sirali hale getirebiiriz

        Arrays.sort(sayilar); //sort-->sirala
        System.out.println(Arrays.toString(sayilar));//[3, 4, 5, 6, 7, 9]


    }
}
