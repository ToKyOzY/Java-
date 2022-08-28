package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        marketteki tum urunleri bnir array'de tuttugumuzu varsayalim
        kullaniciya index sorup o index'deki urunu yazdiran bir prog yazdirarlim
        kullanici urun sayisindan buyuk bir index girerse
        exception vermesinin onuna gecelim
         */

        String []urunler={"nutella","cokokrem","sut","cay","findik"};

        Scanner scan;
        int istenenSira=0;
        boolean kontrol=true;
        while (kontrol){
            try {
               scan =new Scanner(System.in);
                System.out.println("istediginiz urunun sira nosunu giriniz");
                istenenSira=scan.nextInt();
                kontrol=false;
            } catch (InputMismatchException e) {
                System.out.println("urun index'i icin bir tam sayi girmeniz gerekli");
            }
        }
        /*
        catch blogunun onundeki parantezde exception class'inin ismi ve
        ysnins yakalanan exception'i atadigimiz variable'in ismi olur.(e)

        eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        e kullanilmasa da code calisir.
         */
        try {
            System.out.println("aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+
                    "\nSira numarasi en fazla : "+(urunler.length)+" olabilir");
        }
    }
}
