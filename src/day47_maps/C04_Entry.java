package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map'in icerisinde bulunan her bir kaydi
        K=V seklinde tutar
        dolayisiyla herhangi bir Entry'e ulastigimizda
        hem key'e hem de value'ya ulasabilir ve istedigimiz islemleri yapabilliriz

        entry.getKey() bize key'i getirir
        entry.getValue() bize value'yu getirir
        entry.setValue() value'yu istedigimiz deger olarak update eder..
         */
        Map<Integer, String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //Map'in her bir elemani alt alta yazdirin
        sinifListMap.entrySet();
        Set<Map.Entry<Integer, String>> sinifEntrySet= sinifListMap.entrySet();
        for (Map.Entry<Integer, String> each : sinifEntrySet
             ) {
            System.out.println(each);
        }

        //Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer, String> each : sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}
