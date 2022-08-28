package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);

        sayilar1.remove(1);
        /*
        sayılardan oluşan bir list varsa
        java remove method'unda sayı yaazdıgımızda direkt index
        olarak kabul eder.

         */
        System.out.println(sayilar1);

        //5'i silsin istiyorum
        //silinecek bir objeyi bir variable'a tanımlayabiliriz

        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);

        //veya indexof method'undan yardım alabiliriz
        sayilar1.remove(sayilar1.indexOf(2));
        //2 yi silmek için 2'nin index'ini bulup onu remove'a yazabiliriz
        System.out.println(sayilar1);


    }
}
