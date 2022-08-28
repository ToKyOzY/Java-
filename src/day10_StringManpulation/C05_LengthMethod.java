package day10_StringManpulation;

public class C05_LengthMethod {
    public static void main(String[] args) {

        String str= "java ogren, isi kap";

        System.out.println(str.length()); //str'in karakter sayisini dondurur.

        System.out.println(str.charAt(str.length()-1)); //son karakterini yazdiralim p

        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakter

        /*
        javada null pointer (isaretleyici) bir deger degil
        karsisina yazildigi variable'in hic bir deger olmadiginin isaretidir
         */

        String str2= "" ; //str2'ye bir eger atanmiş ama hiclik degeri atanmis

        System.out.println(str2.length()); //0

        String str3=null; //str3'e bir deger atanmiş midir HAYIR
        //null bu deger atamamayi isaret etmektedir

        System.out.println(str3.length()); //bir deger atamamiş ki nasil uzunlugu versin

        //null bir eşitligin karşısında olsa bile bu bir atama degildir.


    }
}
