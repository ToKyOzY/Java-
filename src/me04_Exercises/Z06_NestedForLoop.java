package me04_Exercises;

public class Z06_NestedForLoop {
    public static void main(String[] args) {
       /*
       Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
asagidaki sekli cizdirin
*
* *
* * *
* * * * 
        */
        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}