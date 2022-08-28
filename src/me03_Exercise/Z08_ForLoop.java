package me03_Exercise;

public class Z08_ForLoop {
    public static void main(String[] args) {
        /*
        input olarak verilen String'i terse cevireip yazdıran bir method
        oluşturalım

         */

        String input="Java gun gectikçe güzelleşiyor";

        tersYazdir(input);


    }

    public static void tersYazdir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);


    }


}
