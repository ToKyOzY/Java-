package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String > sinifList= new HashMap<>();

        sinifList.put(101,"Ali Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);//{101=Ali Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());

        System.out.println(sinifList.values().size());//4

        //Tum ogrencilerin bilgilerini alt alta yazdirin

        Collection<String> tumValueColl=sinifList.values();

        String[] eachArr;
        int sira=1;
        for (String each:tumValueColl
             ) {
            //buradaki her bir each bize her bir ogrenciye ait
            //ayni yapidaki isim, soyisim,brans bilgilerini iceren String'ler getiriyor
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
        }

        /*
        map'de bulunan ogrencilerin isim ve soyisimlerini birlestirerek
        bir sinif listesi olusturun
         */
        List<String > sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
        }
        System.out.println(sinifIsimSoyisimList);
    }
}
