package day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 1); // kod bu durumda önce sağdaki işlemi yapr.
        //cahar yeniHaarf= 97+1 yapar
        //char bir variable 98 olamayacağı için hata verir.
        System.out.println(yeniHarf);
        //char yeniHarf = (char) (harf + 1); ---> 98 in char olarak değerini istemiş olduk
        //yaptığınız bir işlemin sonucunu char olarak almak istiyorsak başına (char) getiriz

        /*
        bazen bir variable'a oluşturulduğu data turu dışından değer atanaabilir
        bunlardan bazısını java otamatik olarak kabul eder.

        java eğer bu değer atamasında sorun oluşacağnı
        (data kayıplarının olabileceği veya
        datanın başkalaşabileceği) görürse bu durumda otamatik olarak
        bu atamayı kabul etmez.
        sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı ister.

         */
        int sayi1=(int)7.3;
        System.out.println("sayi1:"+sayi1); //7 küsuratı atar

        double sayi2=10;
        System.out.println("sayi2:"+ sayi2); // 10.0

        int sayi3='c';
        System.out.println("sayi3:"+sayi3); //99

        char harf2= 98;
        System.out.println("harf2:"+harf2);  //b




    }
}
