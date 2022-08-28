package day29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element iceren array ve arraylist gibi ypilarda da
        passByValue gecerlidir

        eger method da array veya List'in kendisi degistirilirse
        passByValue ozelligi sebebiyle Java degisen degeri degil
        array veya List in orjinal degerini alir

        Ancak array veya List degistirilmeden
        sadece icindeki elemanlar degistirilirse
        Java obje degismedigi için(referans aynı)
        aynı array veya List'i bize döndürür
        ancak içindeki elementler degismis olacaktir
         */

        /*
        verilen 4 elemanli bir array'i
        method'a gonderelim
        method'da yeni 3 elemanli bir array atayip
        bu yeni array'e rast gele 100'den kucuk 3 sayi atayalim
        method'da array'i yazdiralim

        main method'da da method call'dan sonra yeniden method'u yazdiralim
         */
        int[] arr={3,5,8,10};



        arrayDegistir(arr);
        System.out.println("Method call'dan sonra main method'da array :"+Arrays.toString(arr));

    }
    public static void arrayDegistir(int[] arr){
        arr=new int[3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));
    }
}
