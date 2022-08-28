package day12_StringManipulations;

public class C04_Subsring {
    public static void main(String[] args) {

        String str="Java cok yasa";

        System.out.println(str.substring(3,4)); // a-->3. indeksten başla üç dahil
        // 4den sonrasını alma geriye 3 yani a kalır

        System.out.println(str.substring(5,7)); //co

        System.out.println(str.substring(6,6)); //""

        System.out.println("****");

       // System.out.println(str.substring(6,2)); // exception

    }
}
