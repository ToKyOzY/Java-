package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;
    static {
        System.out.println("satatic block calisti");
        /*
        static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)

        static block class olusturuldugunda calisir
        genellikle de classla ilgili on ayarlamalar veya static variable'lara deger
        tamak icin kullanilir

        static blocklarin class icerisinde nerede oldugu onemli degildir
        once static blocklar calisir

        birden fazla static block varsa yukaridan asagiya dogru calisir
         */
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }
    static {
        System.out.println("main method altinadaki static block calisti");

    }
}
