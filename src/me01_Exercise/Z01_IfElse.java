package me01_Exercise;

import java.util.Scanner;

public class Z01_IfElse {
    public static void main(String[] args) {
        /*
        kullanicidan dikdörtgenin kenar uzunluklarini isteyin
        ve dikdörtgenin kare olup olmadigini yazin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kisa kenarini giriniz");
        int kisaK= scan.nextInt();
        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        int uzunK=scan.nextInt();

        if (kisaK==uzunK){
            System.out.println("karedir");
        }else {
            System.out.println("dikdörtgendir");
        }
    }
}
