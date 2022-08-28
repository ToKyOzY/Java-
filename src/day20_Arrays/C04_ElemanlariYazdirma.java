package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7};

        //Array'in tamamini yazdiralim
        System.out.println(Arrays.toString(sayilar));

        //Array'in tum elementlerini yazdirin--> tum elementleri for loop ile yazdırıyoruz
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(sayilar[i]+ " ");


        }
        System.out.println("");

        for (int i = 0; i <sayilar.length ; i++) {
            if (i!=sayilar.length-1){
                System.out.print(sayilar[i]+ " ");
            }else {
                System.out.println(sayilar[i]);
            }
        }

    }
}
