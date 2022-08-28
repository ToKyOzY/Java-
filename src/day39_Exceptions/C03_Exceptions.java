package day39_Exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");
        } catch (Exception e) {
            System.out.println("ongorulmeyen bir hata olustu");
        }


        System.out.println("sayinin karesi : " + sayi * sayi);

        /*
        kullanicidan String olarak bir deger aliyor ve bunu int ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz
        NFE aldigimizda code'un durmamasini itiyorsak
        try catch ile cevreleyebiliriz

        eger bilmedigim bir exception daha olusursa
        kodun durmamasi icin bir kere daha catch cumlesi ekleyip
        ona en genis exception'i yazabiliriz

         */
    }
}
