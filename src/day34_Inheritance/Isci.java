package day34_Inheritance;

public class Isci extends Personel{
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inharit
    etmek istedikleri class'i kendilerine parent edinirler
    Java'da tercih hakki child'in

    mesela isci class'ını olusturunca nelere ihtiyaci var diye dusunsek
    personel class'ındaki tum variable ve method'lara ihtiyaci oldugunu gorebiliriz
    bu durumda yeniden o variable ve method'lari olusturmak yerine
    personel class'ini kendimize parent ediniriz

    bir class'i parent edinmek icin extends keyword kullanmaliyiz

    bir class baska bir class'i parent edindiginde
   1- parent class'daki tum ozelliklere(variable+method) otamatik olarak sahip olur
   2- parent class'daki ozelliklerden bazilarini

     */
    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim);
        //kendi class'imizda isim variable'i yok onun icin parent'a gidiyoruz
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 kendi class'imizda varsa ona bakariz
        isci1.maas();//sciler min 15 euro saat ucreti alir

    }
    public void maas(){
        System.out.println("isciler min 15 euro saat ucreti alir");

    }
    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");

    }
}
