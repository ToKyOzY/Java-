package me02_Exercise;

public class Z04_StringManipulationEquals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can"+ "";
        String str4="Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str5);//false
        System.out.println(str1.equals(str5));//true

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

        //equals ve equalsıgnorecase in farki ıgnore olan sadece
        //buyuk harf kucuk harfi ıgnore eder farklı bir karkakter varse onu ıgnore etmez


    }
}
