package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gun numarasını alip
        1 ise pazartesi,
        ....
        7 ise pazar yazdiralim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacıncı gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        /*
        switch yanina yazilan () neye gore
        case atayacaginizi gosterir
        java girilen degere gore case i bulur ve o
        satirdan itibaren caliştirmaya baslar
        break yazisi gorene kadar veya switch
        parantezine kadar devam eder

        if - else if -  ... yapisinda oldugu gibi
        hicbir sarta uymayanlari default keyword kullanilir
         */

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi giriniz");
        }

    }
}
