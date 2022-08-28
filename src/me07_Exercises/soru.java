package me07_Exercises;

import java.util.Scanner;

public class soru {
   /* kullanicidan 2 sayi alin.
    aldiginiz 1. sayiya kadar olan tum sayilarin
     içinden 2. sayiya tam bolunebilen tum sayilari toplayin.


    */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println(" iki sayi giriniz");
       int sayi1= scan.nextInt();
       int sayi2=scan.nextInt();

       int bolunebilen=0;
       for (int i = 0; i <=sayi1 ; i++) {
           if (i%sayi2==0){
              bolunebilen+=i;

           }

       }
       System.out.println(bolunebilen);

   }
}
