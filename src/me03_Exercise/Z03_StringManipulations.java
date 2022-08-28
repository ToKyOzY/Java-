package me03_Exercise;

public class Z03_StringManipulations {
    public static void main(String[] args) {
        /*
         String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”
         String’ini “Java
            ogrenmek cok guzel.” sekline getirin
         */

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.trim().replaceAll("\\d","").
                          replace("@",".").replace("C","c");

        System.out.println(str);
    }
}
