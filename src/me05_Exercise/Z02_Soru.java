package me05_Exercise;

public class Z02_Soru {
    public static void main(String[] args) {
        //9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
        int bas=9;
        int bit=190;
        int temp=bas;
        do {
            if (temp%7==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }while (temp<=bit);
    }
}
