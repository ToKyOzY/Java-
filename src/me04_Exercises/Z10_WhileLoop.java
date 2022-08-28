package me04_Exercises;

import java.util.Scanner;

public class Z10_WhileLoop {
    public static void main(String[] args) {
/*
Kullanicidan baslangic ve bitis degerlerini alin.
 Baslangic degeri ve bitis degeri
dahil aradalarindaki tum cift tamsayilari while loop
 kullanarak ekrana yazdiriniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("başlangıç degeri giriniz");
        int bas=scan.nextInt();
        System.out.println("bitiş degerini giriniz");
        int bit=scan.nextInt();

        int temp=bas;
        while (temp<=bit){
            if (temp%2==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }



    }
}
