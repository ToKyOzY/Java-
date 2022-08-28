package lambda_fuctional_praogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        /*
        1- Lambda(functional programming) Java 8 ile kullanilmaya başlanmıştır
        2- Functional Programming'de "Ne yapılacak"(What to do)  üzerine yooğunlaşılır.
        Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.
        3- Functional Programming, Arrays ve Collections ile kullanılır.
        4- "entrySet() method'u ile map, Set'e dönüştürülerek Functional Programming'de kullanilabilir.

         */
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
        listElemanlariniYazdirStructured(liste);
        System.out.println("");
        listElemanlariniYazdirFunctional(liste);
        System.out.println("");
        ciftElemanlariYazdirStructured(liste);
        System.out.println("");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println("");
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println("");
        tekrarsizCiftElemanlarinKareTpolami(liste);
        System.out.println("");
        tekrarsizCiftElemanlarinKuplerinCarp(liste);
        System.out.println("");
        getMaxEleman(liste);
        getMaxEleman2(liste);
        System.out.println("");
        getYedidenBuyukCiftMin(liste);
        System.out.println("");
        getYedidenBuyukCiftMin02(liste);
        getYedidenBuyukCiftMin03(liste);
        getTersSiralamaTekrarsizElamanlarinYarisi(liste);

    }

    //Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            System.out.print(w + " ");
        }
    }

    //Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        //stream() method'u collection'dan elementleri
        // akışa dahil etmek için ve method'lara ulaşmak için kullanılır.
    }

    //Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Srructured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
    }

    //Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //Ardışık tek list elemanlarının karelerini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> !(t % 2 == 0)).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }
    //tekrarsız cift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareTpolami(List<Integer> list) {
        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }


    //6) Tekrarsiz cift elemanlarin küpünün carpimini hesaplayan bir emthod oluşturun
    public static void tekrarsizCiftElemanlarinKuplerinCarp(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }

    //7) List elemeanlari arasından en buyuk degeri bulan bir method oluşturun
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2. yol :
    public static void getMaxEleman2(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("max: " + max);
    }

    //ödev
    //8) List elemanları arasından en küçük degeri bulan bir method oluşturun


    //9) List elemanların araından 7'den büyük, çift, en küçük degeri bulan bir method oluşturun
    //1. yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){
        Integer min=list.stream().distinct().filter(t -> t % 2 == 0).filter(t-> t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t: u);
        System.out.println(min);
    }
    //2. yol:
    public static void getYedidenBuyukCiftMin02(List<Integer> list){
        Integer min=list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t-> t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t, u)-> u);
        System.out.println(min);
    }
    //3. yol:
    public static void getYedidenBuyukCiftMin03(List<Integer> list){
        Integer min=list.stream().filter(t -> t % 2 == 0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun
    public static void getTersSiralamaTekrarsizElamanlarinYarisi(List<Integer> list){
       List<Double> sonuc= list.stream().distinct().filter(t-> t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }
}