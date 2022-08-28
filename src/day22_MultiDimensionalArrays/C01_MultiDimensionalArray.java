package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        tek katli arraylerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve

        her non-primitive data turleri direkt yazdırılamayabilir

        ancak array'in icindeki elementleri direkt yazdırabiliyorduk
        çünkü genelde primitiv data turu ya da String elementler kullanılıyordu

        Multi dimensional arrays'lerde en dikkat edecegimiz konu ulaşmak
        istediğimiz elmentin bir array mi yoksa primitive data mı oldugunudur.
         */

        int [][] sayilar={{1,2,4,5},{3,4}};
        /*
        burada sayilar array'ini düşünürsek içinde iki tane inner array var

        ancak en içerdeki elementlere ulaşırsak direkt yazdırabiliriz

         */
        System.out.println(sayilar[0]);
        System.out.println(Arrays.toString(sayilar[0]));

        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.deepToString(sayilar));

        /*
        array'i 2 şekilde declare edebiliyorduk
        1- elemanları direkt yazabiliriz
        int [][] sayilar={{1,2,4,5},{3,4}};
        2- outer ve inner array'lerin uzunluklarını belirterek oluşturabiliriz
        int [][] sayilar=new int{3}{4};

        ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz

         */

    }
}
