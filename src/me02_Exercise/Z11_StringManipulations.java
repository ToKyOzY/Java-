package me02_Exercise;

public class Z11_StringManipulations {
    public static void main(String[] args) {

        String isim="zeynep";
        String soyIsim="sarikaya";
        String kKarti="1234 4567 7899";

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*")+" "+
                soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*")+"\n"+kKarti.replaceAll("\\d","*"));
    }
}
