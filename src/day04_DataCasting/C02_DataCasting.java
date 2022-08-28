package day04_DataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {
        int sayi1 = 23;
        int sayi2 = 5;
        System.out.println(sayi1 / sayi2);  //ikisi de int olduğundan sonucu
        //int olarak kabul edip yazdırır.
        System.out.println(25 * 7 / 3); //58
        double sayi3 = 5;
        System.out.println(sayi1 / sayi3); //4.6 iki variable ın data turu değişik olduğunda
        //daha kapsamlı olanı data turu olarak kabul eder.

    }
}
