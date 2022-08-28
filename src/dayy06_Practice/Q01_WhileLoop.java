package dayy06_Practice;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        basamakToplami(sayi);

    }

    private static int basamakToplami(int sayi) {
        int toplam=0;
        while (sayi==0){
            toplam+=sayi%10;
        }

        return toplam;
    }
}
