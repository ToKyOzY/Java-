package me05_Exercise;

public class Z03_Soru {
    public static void main(String[] args) {
        //âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.

        char ilk='m';
        char son='c';
        char temp=ilk;

        do {
            System.out.print(temp+" ");
            temp--;
        }while (temp>=son);
    }
}
