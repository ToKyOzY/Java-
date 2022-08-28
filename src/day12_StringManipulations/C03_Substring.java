package day12_StringManipulations;

public class C03_Substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyIsım="Karanfil";
        String kartNo="1234 6576 6575";

        System.out.println(isim.substring(3)); //eyman

        System.out.println(soyIsım.substring(soyIsım.length()-3));

        System.out.println(isim.substring(2,4)); //10

        //isim ve soyismin ilk harfi buyuk harf,geriye kalan yıldız
        //kredi kartının ilk 4 rakamı görünsün geriye kalan *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyIsimIlkHarf=soyIsım.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar=soyIsım.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                            soyIsimIlkHarf+isimGeriyeKalanlar+" \n" +
                            kkIlk4+kkGeriyeKalanlar);

    }
}
