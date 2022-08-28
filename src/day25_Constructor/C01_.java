package day25_Constructor;

public class C01_ {

    /*
    Java OOP consept kullandigi icin her bir class'ın
    ihtiyac oldugunda obje uretebilmesine uygun dizayn edilmistir

    her class'dan obje uretilmeyebilir

    bunun icin java ihtiyac halinde kullanilmasi icin
    her class'da default bir constructor koymustur

    bu default constructor
    class'dan obje olusturldugunda otamatik olarak calisir

    ornegin bu class'da constructor gorunmemesine ragmen
    co2 class'ında icinde oldugumuz c01 class'ından
    bir obje uretebildik
     */

    int sayi;

    public void deneme(){
        System.out.println("C01 den deneme methodu calisir");
    }
}
