package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.cotains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak döner
        map.contains(value)==> bir butun olarak vakue'nunmap'de olup olmadigini döner

        ONEMLİ NOTT= map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                    eger value icindeki bir parcayi aratmak istiyorsak
                    map uzerinde manipulation yapmamiz lazim

         map.gey(key)===> verilen key'e ait degeri döndürür.
         */

        Map<Integer, String > sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap.containsKey(104)); //true
        System.out.println(sinifListMap.containsKey(114)); //false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDEv")); //true
        System.out.println(sinifListMap.containsValue("JDev"));//false

        //verilen map'de JDev degerlerini JavaDeveloper olarak degisterelim
        // Map'lerde replace tüm value'yu degistirmek istersek kullanilabilir
        //kismi degisiklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        Collection<String> valueCollection= sinifListMap.values();

        for (String each:valueCollection
             ) {
            each=each.replace("JDev","JavaDeveloper");
            System.out.println(each);
        }
        System.out.println(sinifListMap);


        /*
        Map'i guncelleme yapmak icin key yenideger'i map'e eklemeliyiz
        ornegin: key 101 icin value Ali, Can,JDev
        guncelleme icin sinifListMap.put(101, Ali, Can, JavaDeveloper)

       bunu yapabilmek icin her bir key'e ve ona ait value'ye ihtiyacim var
         */

        Set<Integer> keySeti=sinifListMap.keySet();

        String eahValue;
        for (Integer each:keySeti
             ) {
            eahValue=sinifListMap.get(each);
            eahValue=eahValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eahValue);
            /*
            biz key'lerin tamamini aldik her bir key'lerin
            value'sunu get'irdik
            value uzerinde degisikligi yapip
            yeni halini put(key, yeniDeger) ile map'e koyduk
             */
        }
        System.out.println(sinifListMap);
    }
}
