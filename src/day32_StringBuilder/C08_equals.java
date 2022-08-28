package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));//false

        System.out.println(sb1.equals(str));//
        //StringBuilder'da equals methodu anca ayni obje ayni deger olursa true doner
        //String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));//-4

        /*
        compareto methodu iki Stringbuilder'i bastan
        baslayarak harf harf
        karsilastirir
        ilk harfler ayni ise 2. ye gecer
        ilk farkli olan harfe kadar gider
        farkli olani buldugu anda farkli olan iki harfin ascii code'lari arasindaki
        farki verir.

        eger hic farkli harf yoksa sonuc olarak 0 dondürür.
         */

    }
}
