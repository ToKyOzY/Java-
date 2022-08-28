package day35_InharitanceDaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    extends keyword kullanilan class'larda ister
    default cons bulunsun
    istersek de biz yeni cons'lar olusturalim
    Java cons'in ilk satirina
    super(); constructor call yazar

    super(); cons call default cons'a benzer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir cons call yazarsak
    Java super(); constructor'ini siler

    eger biz mudahale edip kendi cons olusturmazsak
    Java'nin default olarak olusturdugu cons her zaman
    paraetresizdir yani super cons call
     */
    FMemur() {

        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim) {

        System.out.println("Muhasebe parametreli cons");
    }

    public static void main(String[] args) {
        FMemur memur1 = new FMemur();

    }
}
