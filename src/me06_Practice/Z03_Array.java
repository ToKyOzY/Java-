package me06_Practice;

import java.util.Scanner;

public class Z03_Array {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’in istenen bir
        elemanti icerip icermedigini kontrol edip, bize true veya
         false sonucu donen bir method olusturun.
         */
        String[] isimler={"basak","nurullah","enes","fatih"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aradıgınız ismi yaziniz :");
        String arananKelime=scan.nextLine();

        boolean sonuc=containsMetod(isimler,arananKelime);
        if (sonuc){
            System.out.println("girilen isim listede var");
        }else
            System.out.println("girilen isim listede yok");

    }

    private static boolean containsMetod(String[] isimler, String arananKelime) {
        boolean methoddakiSonuc=false;
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananKelime)){
                methoddakiSonuc=true;
            }

        }


        return methoddakiSonuc;
    }
}
