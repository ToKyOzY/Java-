package day17_NestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa göre
         yıldızlardan oluşan bir ucgen olusturun
         input=4 ise
         *
         **
         ***
         ****

         */
        int input=7;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
