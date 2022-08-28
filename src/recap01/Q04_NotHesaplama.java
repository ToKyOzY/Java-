package recap01;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        //bu sefer initialize ederek yapalim

        int vize1;
        int vize2;
        int finalNot;
        // or int vize1, vize2, finalNot;

        System.out.println("lutfen vize1 giriniz : ");
        vize1= scan.nextInt();

        System.out.println("lutfen vize2 giriniz: ");
        vize2=scan.nextInt();

        System.out.println("lutfen finalNot giriniz : ");
        finalNot=scan.nextInt();

        double sonuc=((vize1+vize2)/2)*0.3 +finalNot*0.7;
        System.out.println("sonuc = " + sonuc);

    }
}
