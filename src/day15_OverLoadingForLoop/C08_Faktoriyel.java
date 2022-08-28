package day15_OverLoadingForLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayi icin faktoriyel hesaplayip
        yazdiran bir method olusturun
        verilen sayi 0, negatif veya 20'den buyuk olursa "girilen sayinin
        faktoriyeli hesaplanamaz" uyarisi yazdirin
         */

        int input=5;
        faktoryelHesapla(input);

    }

    public static void faktoryelHesapla(int input) {

        int faktoryel=1;
        if (input<0 || input>20){
            System.out.println("verilen sayi icin faktoryel hesaplanamaz");

        } else if (input==0) {
            System.out.println("0 faktoryel = 1'ir");

        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.println("faktoryel degeri : "+faktoryel);
        }


    }
}
