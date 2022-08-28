package me02_Exercise;

public class Z07_StringManipulation {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        int kelimeilkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeilkIndex==-1){
            System.out.println("cumlede girilen kelime yoktur");
        } else if (kelimeilkIndex==kelimeSonIndex) {
            System.out.println("cumlede girilen kelime bir kere kullanilmis");
        }else {
            System.out.println("verilen kelime birden fazla kullanilmis");

        }


    }
}
