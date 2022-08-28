package day18_WhileDoWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tamsayılar alın
        kullanıcı çift sayı girdigi müddetçe
        sayıları yazdırın
        tek sayı girdiğinde işlemi bitirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        //while loop ile (loopun içerisinde variable oluşturmuyoruz)
        //whilw loop'da looptan önce oluşturduğumuz bu variable'a atayacagımız değeri iyi
        //düşünmemiz gerekiyor

        while (sayi%2==0){
            System.out.println("lutfen bir sayı giriniz ");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi çift : "+sayi);
            }else {
                System.out.println("girilen sayi tek, benden bu kadar ");

            }


        }
        //do while loop ile
        //do while loop'da önceden oluşturulan variable'a hangi deger
        //atandıgının hiçbir önemi yok
        //kodumuz her durumda çalışır

        /*
        do while'ın dezavantajı
        ilk açlıştırma kontrol yapılmadan oldugu için
        loop'un body'sinde yanlış bir işlem yapılmamasına
        dikkat etmek gerekir
         */

        do {
            System.out.println("lutfen bir sayı giriniz ");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi çift : "+sayi);
            }else {
                System.out.println("girilen sayi tek, benden bu kadar ");

            }
        }while (sayi%2==0);

    }
}
