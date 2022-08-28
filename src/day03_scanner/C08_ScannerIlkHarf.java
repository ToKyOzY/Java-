package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp ilk harfini büyük olarak yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        /*
        java scanner classında nextChar() methodu yoktur
         bunun yerine string olarak ilk kelimeyi alıp
         onun da ilk harfini alabiliriz
         */
        char ilkHarf=scan.next().toUpperCase().charAt(0); //java da indeksler 0 dan başlar ilk harf 0'dır 2. harf 1
        System.out.println("ismin ilk harfi:" +ilkHarf);
    }
}
