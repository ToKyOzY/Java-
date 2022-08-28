package day15_OverLoadingForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        /*
        verilen iki sayiyi carpıp sonucu bize donduren
        bir method yapalim

         */


        int sayi1=10;
        int sayi2=5;

         /*
        method 4 adımda oluşturulur
        1. adım method call
        2. adım argument eklenmesi gerekiyorsa  ekleyelim
            eger method'yn return type'ı void'den farklı
            olacaksa bir variable olusturup
            method call'u assign edelim
         */

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("illa da sonucu goreyim diyenlere main method icinde : " + sonuc);
    }
        //getirmesi icin return yazmaliyiz
    public static int carpGetir(int sayi1, int sayi2) {


        System.out.println("illa da sonucu goreyim diyenlere main diger method icinde : " + (sayi1*sayi2));
        return (sayi1*sayi2); //or int sonuc=sayi1*sayi2; and
        // return sonuc;
    }
}
