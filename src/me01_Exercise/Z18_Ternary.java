package me01_Exercise;

import java.util.Scanner;

public class Z18_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int a= scan.nextInt();
        System.out.println(a<10 ? "rakam": a<100 ? "iki basamakli sayi": "daha büyük sayi");



    }
}
