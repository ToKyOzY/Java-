package day30_Immutable;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa stringBulider mı daha hizlidir
        bunun icin bir String olusturup bin kere sonuna nokta ekleyelim
        oncesinde ve sonrasinda zamani alip
        aradaki farki bulalim
        
        ayni islemi stringBuilder icin de yapalim
         */

        LocalTime baslangic=LocalTime.now();
        
        String str="Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str+=".";
            
        }
        
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);
        
        int StringZaman=bitis.getNano()-baslangic.getNano();
        System.out.println("StringZaman = " + StringZaman);


        baslangic=LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <1000 ; i++) {
            sb.append(".");

        }

        bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        int StringBuildZaman=bitis.getNano()-baslangic.getNano();
        System.out.println("StringBuildZaman = " + StringBuildZaman);




    }
}
