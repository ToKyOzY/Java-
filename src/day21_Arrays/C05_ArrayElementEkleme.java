package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */

        String [] sinifListesi={"Ali Can","Nida yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi=new String[sinifListesi.length];
        //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
        //öncelikle eski listedeki tum elemanları yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length+1]=eklenecekIsim; //{null, null, null ,null}
        //son index'e ise eklenecek ismi atadim

        return yeniSinifListesi;
    }
}
