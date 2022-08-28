package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini isteyin girilen ism
       // isminiz: ismail şeklinde yazın
        // insanların dünyasından kodlarımızın bulunduğu class'a
      //değer almak için scanner classını kullanırız
      //1- scanner objesi oluşturalım

        Scanner scan = new Scanner(System.in);

        //2- kullanıcıya ne istediğimizi söyleyelim
        System.out.println("lütfen isminizi giriniz");

        //3- oluşturduğumuz scan objesi ile kullanıcının girdiiği değeri alıp
        //oluşturduğunuz uygun bir variable a atayınız.
        String kullaniciIsmi = scan.next();
        System.out.println("isminiz:" + kullaniciIsmi);
    }

}
