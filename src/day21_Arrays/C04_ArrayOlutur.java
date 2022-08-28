package day21_Arrays;

import java.util.Scanner;

public class C04_ArrayOlutur {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
        bir array olusturup, bu array’i bize donduren bir method olusturun
         */
        int[] sayilar = arrayOlustur();
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz");
        int uzunluk = scan.nextInt();
        int[] olusturulan = new int[uzunluk];


        for (int i = 0; i < uzunluk; i++) {


        }


        return olusturulan;
    }
}

