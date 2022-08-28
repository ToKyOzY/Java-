package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.etryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("cler'den sonra map : "+sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(110,"aradiginiz key yok"));

        System.out.println(sinifListMap.isEmpty());
        sinifListMap.putIfAbsent(104,"Derys, Okyanus, Developer");
        ReusableMethods.etryYazdir(sinifListMap);

        /*
        SinifListMap'e key 106, value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz" yazdirin

        106'in oldugunu kontrol etmek icin containsKey daha mantikli ama
        biz yeni ogrendigimiz method ile yapalim

        map.putIfAbsent(key,value) ==> key varsa
        ekleme yapmaz, bize o key ile kayitli olan value'yu dondurur
        ==>key daha onceden map'e eklenmemisse
        eklemeyi yapar ve bize null döndürür
         */
        System.out.println(sinifListMap.putIfAbsent(109, "Mevlut, Han, Tester"));
        if (sinifListMap.putIfAbsent(104,"Derys, Okyanus, Developer")!=null){
            System.out.println("Kayit basarili");
        }else {
            System.out.println("eski degeri degistirmek istediginizden emin misiniz");
        }
        ReusableMethods.etryYazdir(sinifListMap);

        sinifListMap.remove(106);
        sinifListMap.remove(107,"Derya, cem, Tester");

        ReusableMethods.etryYazdir(sinifListMap);

        sinifListMap.replace(105, "Erdal, Ciftci, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev");
        ReusableMethods.etryYazdir(sinifListMap);

        System.out.println(sinifListMap.size());










    }
}
