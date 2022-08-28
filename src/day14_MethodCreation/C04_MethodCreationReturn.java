package day14_MethodCreation;



public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        /*
        verilen isim ve soyismin ilk harfi buyuk geriye
        kalanlari yildiz olacak sekilde degistirip
        bize bu halini donduren bir method olusturun,

        Not: programin data base'inde ve ilerleyen programın ilerleyen kisimlerinde isim
        ve soyismi bu sekilde kullanmak istiyoruz
         */
        String isim = "Enes";
        String soyIsim = "Bozkurt";

        String gizliIsim = ismiGizle(isim, soyIsim);


    }

    public static String ismiGizle(String isim, String soyIsim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
        System.out.println(isim + " " + soyIsim);


        return isim + " " + soyIsim;
    }
}