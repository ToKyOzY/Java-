package day40_final;

public class A {
    String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";
    /*
    bir variable final olarak tanimlandiysa
    baska class'lardan veya icinde oldugumuz class'dan
    bu variable'a baska deger atamasi mumkun degildir.

    Madem ki degeri degistirilemiyor
    genelde static de yaparak bu
    variable'a erisim kolaylastirilabilir.
    ve genelde static final olarak belirlenen variable isimleri
    BUYUK HARFLE yazilir
     */

    final void finalMethod(){
        System.out.println("final method'lar override edilemez");
        /*
        bir method'u final olarak isaretlerseniz
        bu method degistirilemez demektir.(override edilemez)
         */
    }
}
