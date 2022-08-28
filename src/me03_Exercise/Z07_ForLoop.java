package me03_Exercise;

public class Z07_ForLoop {
    public static void main(String[] args) {

        //1'deb 5e kadar olan tamsayıları toplayalım

        int top=0;

        for (int i = 1; i <=5; i++) {
                top+=i;


        }
        System.out.println(top);

        //30 dan 100 kadar çift sayıları topla 30 dahil

        top=0;
        for (int i =30; i <=100 ; i+=2) {
            top+=i;

        }
        System.out.println(top);
    }
}
