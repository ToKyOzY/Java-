package dayy01_practice01;

import java.util.Scanner;

public class Q08_Scanner01 {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int s1=scan.nextInt();
        System.out.println("lutfen iinci sayiyi giriniz");
        int s2=scan.nextInt();
        int top=s1+s2;
        System.out.println("toplam: "+top); // or System.out.println("toplam: "+ (s1+s2));

    }
}
