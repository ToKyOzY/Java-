package day18_WhileDoWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=7;
        /*
        while loop'da önce kontrol edip sonra işlem yaptıgımız
        için işlem bittikten sonra loop'un kırılması için bir
        kez daha başa dönmemiz gerekiyor
        bu durumda fazladan işlem yapılıyor
         */

        while (sayi<10){

            System.out.println(sayi);

            sayi++;

        }
        /*
        do while loop ile çalıştıgımızda bu dezavantaj ortadan
        kalkar

         */
        sayi=7;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);

    }
}
