package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hasaplayip bize döndüren bir method olusturun
         */

        double satisFiyati=100;

        /*
        Pass by value--->bir method'a bizim bir argumentimizi gonderdigimiz zaman parametre olarak
        Java bizim orjinal datamizi degil onun bir kopyasini gonderir boylece benim orjinal datam bozulmamis olur
        (diplamanin asli durur fotokopisiyle is yapar)
        Java Pass By Value'dur
         */

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
        System.out.println("indirimli fiyat : "+indirimliFiyat);
    }

    private static double indirimliFiyatHesapla(double satisFiyati) {
        double indirimliFiyat=satisFiyati*0.75;

        return indirimliFiyat;
    }
}
