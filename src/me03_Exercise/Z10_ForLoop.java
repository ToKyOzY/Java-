package me03_Exercise;

public class Z10_ForLoop {
    public static void main(String[] args) {

        //500 den 1 e kadar 3 ile bölünebilen sayilari yazdır

        for (int i = 500; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
