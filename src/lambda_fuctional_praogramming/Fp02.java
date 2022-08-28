package lambda_fuctional_praogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1-   t-> "Logic" ,(t,u) -> "Logic"
         Bu yapıya "Lambda Expression"
    2-   Functional Programming kapsamında "Lambda Expression" kullanılabilir ama önerilmez
         "Lambda Expression" yerine "Method Reference" tercih edilir.
    3-    "Method Reference" kullanımı "Class Name :: Method Name"

          Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
          örneğin : bir animal class'ınız var ve bu class "eat()" method'una sahip ==> "Animal :: eat"

    */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlarinYazdirFunctional(liste);
        System.out.println("");
        ciftElemanlarinYazdirFunctional(liste);
        System.out.println("");
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println("");
        tekrarsizElemanlarinKupunuYazdir(liste);
        System.out.println("");
        tekrarsizCiftElemanlarinKareToplama(liste);
        tekrarsizCiftElemanlarinKareToplama2(liste);
        tekrarsizCiftElemanlarinKareToplama3(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }

    //Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Structured)
    public static void listElemanlarinYazdirFunctional(List<Integer> list) {

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void ciftElemanlarinYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //Ardışık tek list elemanlarının karelerini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //Ardışık tek list elemanlarının kuplerini tekrarsiz olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void tekrarsizElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //tekrarsız cift elemanların karelerinin toplamını hesaplayan bir method oluşturun.


    //1.Yol:
    public static void tekrarsizCiftElemanlarinKareToplama(List<Integer> list) {
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }
    //2.yol:
    public static void tekrarsizCiftElemanlarinKareToplama2(List<Integer> list) {
       Integer toplam= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    //3.Yol:
    public static void tekrarsizCiftElemanlarinKareToplama3(List<Integer> list) {
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println(toplam);
    }

    //6) Tekrarsiz cift elemanlarin küpünün carpimini hesaplayan bir emthod oluşturun

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {
       Integer carpim= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemeanlari arasından en buyuk degeri bulan bir method oluşturun
    public static void getMaxEleman(List<Integer> list) {

        Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //9) List elemanların araından 7'den büyük, çift, en küçük degeri bulan bir method oluşturun
    public static void yedidenBuyukCiftMin(List<Integer> list) {
       Integer min= list.stream().distinct().filter(t-> t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun
    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
       List<Double>  result=list.
                           stream(). //gerekli methodlari kulanmayi saglar
                           distinct().//tekrarli olanlari atar
                           filter(t-> t>5).//kosula gore filtreleme yapar
                           map(Utils::yarisiniAl).//her bir elemanin degerini degistirmeye yarar
                           sorted(Comparator.reverseOrder()).//siralama yapar
                           collect(Collectors.toList());//elemanları collektion'a cevirir
        System.out.println(result);
    }



}


