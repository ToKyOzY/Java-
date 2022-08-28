package day42_AbstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {

    int SAYI=30;
    String ISIM="YILDIZ KOLEJI";
    /*
    Interface bir class degildir

    Abstract class'lar Java'da abstraction yani soyutlastirma (kural koyma)islerini
    yapıyordu.
    Ancak abstract bir class'da abstract olmayan method'arda olabilir.
    Bu da full abstraction yapmaya izin vermez.

    Eger Java'da icinde hic concrete method olmazsin
    dedigimiz bir class olusturmak istiyorsak
    bunu class degil interface yapmaliyiz..

    1-INTERFACE'LERDE CONCRETE METHOD OLMAZ.
    2-Interface'ler full abstraction yaptigindan Interface'lerden obje olusturulamaz..

    Hatirladigimiz gibi interface olan List'den obje olusturamayiz
      List<String> liste=new List<>(); calismaz
      Bunun yerine constructor'i List'in child2i olan ArrayList'den seceriz
      List<String> liste=new ArrayList<>();

      3- Class'larda bir child birden fazla parent edinemez
      Ancak Interface'lerde concrete method olmadigindan
      biz her method'u child class'da override etmek zorundayiz
      Override ederken kimin soyledigini override etiigimizin onemi yok.

      4-Interface'ler hazir sablonlar gibidir.
      Interface'ler neyin yapilacagini soyler ama nasil yapilacagina karismaz.

      Interface'lerde constructor'a sahip degillerdir.

      Interface'deki veriable'lar mutlaka public, static, final olmalidir.
      private veya protected variable'lar compile time error verir.



     */




}
