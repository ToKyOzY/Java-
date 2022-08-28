package me02_Exercise;

import java.util.Scanner;

public class Z06_StringManipulations {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
- Girilen kelime cumlede kullanilmamis.
- Girilen kelime cumlede 1 kere kullanilmis.
- Girilen kelime cumlede 1’den fazla kullanilmis
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("bir kelime giriniz");
       String kelime= scan.next();

       int kelimeIlkindex=cumle.indexOf(kelime);
       int kelimesonindex=cumle.lastIndexOf(kelime);

       if (kelimeIlkindex==-1){
           System.out.println("kelime cumlede kullanilmamis");
       } else if (kelimeIlkindex==kelimesonindex) {
           System.out.println("kelime cumlede bir kere kullanilmis");


       }else {
           System.out.println("kelime birden fazla kullanilmis");
       }

    }
}
