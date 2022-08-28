package day43_Interfaces_Iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();
    /*
    bunlari kabul etti ama gri renkte olanlari gereksiz gordu yani yazmana gerek yok dedi
     */
    /*
    normal bir class'da oldugumuzu dusunsek
    iki tane access modiifer kullanma ihtimali OLAMAZ..

    Asagidaki method'da gordugunuz gibi istisnai olarak body'si olan
    method'lar olusturulabilir
    Bu ozellik Java 8'den sonra kullanilmaya baslamistir.
    Bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override ermemiz gerekirdi

    bu ozellik sayesinde basina default vetya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan overtride edilme mecburiyeti olmaz
    ve eskiden implement etmis class'lari degistirmemiz gerekmez

    bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    buradki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    O zaman nicin 2 keyword (static ve default) tanimlanmistir??
    Bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.MethodAdi yeterli olur

    default keyword kullanilirsa method'a erismek icin obje olusturulmalidir
     */

    public default void teker(){
        System.out.println("default...tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("static...Tum arabalarin direksiyonu vardir");
    }
}
