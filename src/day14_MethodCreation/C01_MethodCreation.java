package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        /* input olarak verilen 4 harfli bir
        stringi tersten yazdıran bir method olusturalim

         */
        terstenYazir("okan");

    }
    public static void terstenYazir(String input) {
        String tersInput= input.substring(3)+
        input.substring(2,3)+
        input.substring(1,2)+
        input.substring(0,1);
        System.out.println("veilen kelimenin terten yazilisi : "+tersInput);
    }
}
