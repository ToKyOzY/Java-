package me04_Exercises;

public class Z09_WhileLoop {
    public static void main(String[] args) {
        /*
        For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
bolunebilen sayilari yazdirin.
         */

        int bas=100;
        int bit=999;
        int temp=bas;

        while (temp<=bit){
            if (temp%15==0 && temp%20==0 && temp%90==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }
        System.out.println("");

        for (int i = bas; i <=bit ; i++) {
            if (i%15==0 && i%20==0 && i%90==0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
