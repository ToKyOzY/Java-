package day17_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen String'i aşagıdaki
         gibi yazdırna bir program yazdırın
         input = deniz
         D
         De
         Den
         Deni
         Deniz
         */
        String input="Ankara";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
        for (int i = input.length(); i >= 1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
    }
}
