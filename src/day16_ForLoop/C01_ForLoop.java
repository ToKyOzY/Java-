package day16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        verilen pozitif tam sayının
        pozitif tam bölenlerini yazalım

         */

        int input=20;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.println(i+" ");
            }

        }
    }
}
