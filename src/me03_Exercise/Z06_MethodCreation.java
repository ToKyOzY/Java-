package me03_Exercise;



public class Z06_MethodCreation {
    public static void main(String[] args) {

        //döndüren diyorsa return yazdırsn diyorsa void

        int sayi=10;
        int sayi1=5;
        int sonuc=bolGetir(sayi,sayi1);
         /*
         return olup olmamasına requirements karar veriyor

        -- atama yapsakta döndürecek yapmasak da..
        --döndürdüğü sonucu atamak için bir variable'a ihtiyacımız var.

          */

        System.out.println(sonuc);
    }

    public static int bolGetir(int sayi, int sayi1) {

        int sonuc=sayi/sayi1;
        return sonuc;

    }
}
