package day04_DataCasting;

import java.util.Scanner;

public class C08_Exercise03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim girebilirsiniz");
        String isim= scan.nextLine();
        System.out.println("soyisim de girebilirsiniz");
        String soyisim= scan.nextLine();
        System.out.println("isim-soyisim: "+isim+" "+soyisim );

    }
}
