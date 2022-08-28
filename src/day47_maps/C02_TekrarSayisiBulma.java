package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        /*
        verilen bir String'deki kullanilan harfleri
        ve kullanilan harflerin tekrar sayisini
        H=20 seklinde yazdirin
         */
        String  str="Heeeeeeelllllooooo Woooooooorrrlllllldddddd";
        //space'leri saymamasi icin once onlari yok delim
        str=str.replaceAll("\\W","");

        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, e, e, l, l, l, l, l, o, o, o, o, o,  , W, o, o, o, o, o, o, o, o, r, r, r, l, l, l, l, l, l, d, d, d, d, d, d]

        // harfleri key, kullanim adedini, value yaparak bir map olusturlim
        Map<String, Integer> harfKullanimSayilariMap=new HashMap<>();
        Integer harfKullanimSyisi;
        for (String each:harflerArr
             ) {
            if (!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each,1);
            }else {
                harfKullanimSyisi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each,++harfKullanimSyisi);
            }
        }
        System.out.println(harfKullanimSayilariMap);
    }
}
