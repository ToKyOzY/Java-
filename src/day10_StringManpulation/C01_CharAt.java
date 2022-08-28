package day10_StringManpulation;

public class C01_CharAt {
    public static void main(String[] args) {
        String str="java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); //ilk harfi yazdirir0 j

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); //l

        // System.out.println(str.charAt(22)); //senin verdigin indeks sinirlarin disinda
         // son harfi bulmaak icin str'in uzunlugunun bir eksigini indeks olarak gireriz
        //eger indeks olarak uzunlugu veya daha bir sayiyi girersek Java exeption verir


        // charat() methodu kullandığımızda sonuc char olacagı için
        //artık manipulation yapamayiz
        // string methodlarından kullanmamiz gereken
        // bir method varsa charAt'den once kullanmalıyız



    }
}
