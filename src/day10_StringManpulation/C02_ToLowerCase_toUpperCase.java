package day10_StringManpulation;

import java.util.Locale;

public class C02_ToLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="beni psikopata baglamayin";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(new Locale("tr")));

        /*
        eger buyuk kucuk harf dönüşümünden locale bir dili esas almak isterseniz
        bu method kullanilabilir.
         */
    }
}
