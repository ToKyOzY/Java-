package day18_WhileDoWhile;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*

        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.

         */

        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyut="";

        while (temp<=sonHarf){

            buyut=(temp+"").toUpperCase();

            System.out.print(buyut+" ");
            temp+=1;

        }
    }
}
