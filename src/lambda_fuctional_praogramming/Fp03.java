package lambda_fuctional_praogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        System.out.println("");
        buyukHarfleYazdir(liste);
        System.out.println("");
        uzunlugaGoreYazdir(liste);
        System.out.println("");
        uzunlugunaGoreTersYazdir(liste);
        System.out.println("");
        sonKarakterGorTekrarsizYazdir(liste);
        System.out.println("");
        uzunlukVeIkHarfineGoreSirala(liste);
        System.out.println("");
       // uzunlukBestenBuyukseSil(liste);
        //baslangiciAYadaNOlanSil(liste);
       // baslangiciAYadaNOlanSil2(liste);
        //uzunlugu8Ile10ArasiveOIleBiteniSil(liste);
        System.out.println(uzunlugu12denAzMi(liste));
        System.out.println(xIleBaslamiyorMu(liste));
        System.out.println(rIleBitiyorMu(liste));

    }
    //1- Tum elemanlari buyuk harfle yazdiran bir method

    //1/Yol:
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2.Yol:
   // public static void buyukHarfleYazdir2(List<String> list) {
     //   list.replaceAll(String::toUpperCase);
       // System.out.println(list);
    //}

    //2- elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);//Comparator.comparing(): sıralama kosulunu belirtmek icin kullanilir

    }
    //3- elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun
    public static void uzunlugunaGoreTersYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //4-Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method olusturun.
    public static void sonKarakterGorTekrarsizYazdir(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //5-Elamanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method

    public static void uzunlukVeIkHarfineGoreSirala(List<String> list){
        list.stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //6-Uzunlugu 5'ten buyuk ise silen bir method olustur
   // public static void uzunlukBestenBuyukseSil(List<String> list){
     //   list.removeIf(t->t.length()>5);                       ===>> List, mutable oldugu için elemanları işlem sonrası kalıcı degistiginden comment-out yapıyorum
       // System.out.println(list);
    //}

    //7- 'A', 'a' ila baslayan ya da 'N', 'n' ile biten elemanları silen bir method oluşturun
    //1.Yol:
    //public static void baslangiciAYadaNOlanSil(List<String> list) {
      //  list.removeIf(t-> t.charAt(0)=='A'||t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
        //System.out.println(list);
    //}

    //2.Yol:
   // public static void baslangiciAYadaNOlanSil2(List<String> list){
     //   list.removeIf(t-> t.startsWith("a")|| t.startsWith("A") || t.startsWith("n")||t.startsWith("N"));
       // System.out.println(list);
    //}

    //8- uzunlugu 8 ile 10 arası olan ya da 'a' ile biten elemanları yazdıran bir method
    //public static void uzunlugu8Ile10ArasiveOIleBiteniSil(List<String> list){
      //  list.removeIf(t->t.length()>7 && t.length()<11 || t.endsWith("o"));
        //System.out.println(list);
    //}

    //9- Tüm elemanların uzunluklarının 12'den az olup olmadıgını kontrol eden bir method oluşturun

    public static boolean uzunlugu12denAzMi(List<String> list) {
        return list.stream().allMatch(t->t.length()<12);
    }

    //10- Hiçbir elemanın x ile başlamadıgını kontrol eden bir method oluşturun

    public static boolean xIleBaslamiyorMu(List<String> list) {
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11- Herhangi bir elemanın 'r2 ile bitip bitmedigini kontrol  eden bir method oluşturun

    public static boolean rIleBitiyorMu(List<String> list) {
        return list.stream().anyMatch(t->t.endsWith("r"));
    }

}
