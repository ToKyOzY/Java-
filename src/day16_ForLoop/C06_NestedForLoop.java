package day16_ForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        bazen tek değişken sorunu çözmeye yetmez
        *
        **
        ***
        ****
        *****
         */
        // yan yana 3 tane * yaz
        for (int i = 1; i <=3 ; i++) {
            System.out.print("*");
        }

        // bu tür durumlarda neestd loop kullanmak gerekir

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
