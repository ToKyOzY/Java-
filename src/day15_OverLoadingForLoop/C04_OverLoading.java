package day15_OverLoadingForLoop;

public class C04_OverLoading {
        public static void main(String[] args) {

            topla(5,7); //12
            topla(5.2,3); //8.2
            topla(3.4,6.1);
            topla(5,6.2);

        }
        //her int double'a sigar, double int'e sigmaz
    /*
    Java hangi method'un calisacagina karar verirken optimizasyon yapar
    eger hic cast yapmadan kullanilabilecegi bir method varsa onu kullanir
    eger cast yapmadan kullanicagi bir method yoksa en az cast yaparak
    kullanabilecegi method'u tercih eder
     */

        public static void topla(int sayi1, int sayi2){
            System.out.println("iki integer'in toplami :"+sayi1+sayi2);

        }

        public static void topla(double sayi1, int sayi2){
            System.out.println("bir double ve bir integer'in toplami :"+sayi1+sayi2);

        }
        public static void topla(double sayi1, double sayi2){
            System.out.println("iki double'ın toplami :"+sayi1+sayi2);

        }
        /*
        ethodun içindekilere parametre topla(3,4) bunlara ise argument diyoruz parantez icindekilere

         */


    }


