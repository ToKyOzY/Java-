package day07_IfStatements;

import java.util.Scanner;

public class C08_Practice01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen üçgenin bir kenar uzunlugunu giriniz");
        double a=scan.nextDouble();
        System.out.println("lütfen üçgenin ikinci kenar uzunlugunu giriniz");
        double b= scan.nextDouble();
        System.out.println("lütfen üçgenin üçüncü kenar uzunlugunu giriniz");
        double c=scan.nextDouble();

        if (a==b && b==c){
            System.out.println("eşkenar üçgendir");

        } else  {
            System.out.println("eşkenar değildir");


        }
    }
}
