package day17_NestedForLoop;

public class C05_NestedForLoop {
    /*
    verilen input a göre yıldızlardan oluşan
    şekli oluşturun
    *
    **
    ***
    ****
    ***
    **
    *
     */
    //artan kısmı nestedforloop işe yapalım

    public static void main(String[] args) {
        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j =i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }


}
