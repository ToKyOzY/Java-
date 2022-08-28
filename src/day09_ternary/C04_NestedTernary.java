package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*
        kullanicidan bir haf isteyin
        kucuk harf ise consola "kucuk harf"
        buyuk harf ise "buyuk harf"
        yoksa "girdiginiz karakter harf degil" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        char harf=scan.next().charAt(0);
        /*
        String sonuc=(harf>='a' && harf<='z') ? ("kucun harf") :
                ("buyuk harf veya gecersiz karakter");

         */

        String sonuc=(harf>='a' && harf<='z') ? ("kucun harf") :
                     (harf>='A' && harf<='Z' ) ? "buyuk harf" : "gecersiz karakter";

        String sonuc2=harf>='a' && harf<='z' ? "kucun harf" :
                     harf>='A' && harf<='Z'  ? "buyuk harf" : "gecersiz karakter";

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
