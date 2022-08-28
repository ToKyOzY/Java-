package day15_OverLoadingForLoop;

public class C03_OverLoading {
    public static void main(String[] args) {

        topla(5,7); //12
        topla(5.2,3); //8.2
        topla(3.4,6.1);

    }


    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integer'in toplami :"+sayi1+sayi2);

    }
/*

   bir class'da parametre sayisi ve parametre data turleri ayni olan iki method
    olusturamayiz

    public static void topla(int sayi3, int sayi4){
        System.out.println("iki integer'in toplami :"+sayi3+sayi4);
/*

 */
    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami :"+sayi1+sayi2);

    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("bir integer ve bir double'ın toplami :"+sayi1+sayi2);

    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("iki double'ın toplami :"+sayi1+sayi2);

    }


}
