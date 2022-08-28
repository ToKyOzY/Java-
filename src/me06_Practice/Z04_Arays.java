package me06_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Z04_Arays {
    public static void main(String[] args) {
        /*
         Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
        bir array olusturup, bu array’i bize donduren bir method olusturun
         */

        int[] sayilar=arrayOlusturmak();
        System.out.println(Arrays.toString(sayilar));

    }

    private static int[] arrayOlusturmak() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmami istersiniz ?");
        int uzunluk= scan.nextInt();
        int[]olusturulan=new int[uzunluk];

        int sayi=0;

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+ " . index icin sayi giriniz");
            olusturulan[i]=scan.nextInt();

        }

        return olusturulan;
    }
}
