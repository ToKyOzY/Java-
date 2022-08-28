package day11_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi
        buyuk harf olarak, “kucuk” kelimesi iceriyorsa
        tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada
        buyuk kelimesi icermiyor” yazdirin.

         */

        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();

        //requirenments: buyuk harf kucuk harf
        // hassasiyeti hakkinda bir sey soylenmemis
        // ikinci olarak da her iki cumleyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requirenments : ikisini de iceriyorsa "karar ver, buyuk mu yazalim kucuk mu ?"
        // case sensitive olmasin

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu yazalim kucuk mu");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println( cumle.toUpperCase());
        }else{
            System.out.println("cumle kucuk ya da buyuk kelimesi icermiyor");

        }

    }
}
