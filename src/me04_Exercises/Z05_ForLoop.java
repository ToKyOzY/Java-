package me04_Exercises;

public class Z05_ForLoop {
    public static void main(String[] args) {
        /*verilen String'deki kullanılan harfleri
        tekrarsız olarak yazdırıp kelimede kullanılan farklı harf sayısını
        veren bir method yapımız

         */
        String input="Java her zaman guzel";
        takrarszYap(input);

    }

    private static void takrarszYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");
        System.out.println(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);
        for (int i = 1; i <islenecekKelime.length() ; i++) {

           if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))) {
               System.out.print("," + islenecekKelime.substring(i,i+1));
               benzersizInput += islenecekKelime.substring(i, i + 1);
           }
        }
        System.out.println("");
        System.out.println("input : "+input);
        System.out.println("benzersizInput : "+benzersizInput);

    }
}
