package me02_Exercise;

import java.util.Locale;

public class Z03_StringManipulation {
    public static void main(String[] args) {
        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(new Locale("tr")));
    }
}
