package day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
         Interview Question:: Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den küçük bir sayı giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("java güzeldir");
            } else if (i%5==0) {
                System.out.println("güzeldir");

            } else if (i%3==0) {
                System.out.println("java");

            }else {
                System.out.println(i+" ");
            }

        }
    }
}
