package day03_scanner;

import java.util.Scanner;

public class C09_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char karakter='.' ;

        System.out.println("lütfen noktadan sonra mesajınızı bırakınız"+ karakter);

        String ileti= scan.next();
        System.out.println("mesajınız ietildi");
        System.out.println("bizi tercih ettiğiniz için teşekkürler");
    }
}
