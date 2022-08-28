package me04_Exercises;

public class Z08_WhileLoop {
    public static void main(String[] args) {
/*
While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz
 */

        int bas=3;
        int bit=13;
        int temp=bas;

        while (temp<=bit){
            if (!(temp%2==0)){
                System.out.print(temp+" ");

            }
            temp+=3;
        }


    }
}
