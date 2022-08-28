package recap01;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */

        Scanner scanner= new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini girniz :");
        a=scanner.nextDouble();
        System.out.println("b sayisini girniz :");
        b=scanner.nextDouble();
        System.out.println("c sayısını girniz :");
        c=scanner.nextDouble();

        double sonuc= ((a*a)-(b*b));


    }

}
