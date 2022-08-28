package dayy06_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*
        kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
         */

       farkiniBul();
    }

    private static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Arrayin "+(i+1)+" . elemanini giriniz :");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array'deki en buyuk eleman ile en kucuk eleman arasindaki fark  : "+(arr[uzunluk-1]-arr[0]));



    }


}
