package day05_Matematikselİslemler;

public class C01_PrePostIncrement {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1;
        sayi2 +=5; //  sayi--->16
        /*
        pre veya post incremen /decrement işlemi sadece
        ++ ya da-- işlemi için geçerlidir.
        bu iki şlem için sayıdan önce veya
        sonra yazılmasına göre farklı iki işleyiş olur.

         */

        int sayi3 = sayi2++; //1- sayi2 1 arttırılacak
                             //2- sayi2 sayi3 e atanacak
        /*
        ++ veya-- variable'dan sonra olursa
        buna post...
        bu durumda o satırda yapilan
        iki islemden artirma veya azaltma islemin sonuncudur
        */

        System.out.println("sayi3:" + sayi3);
        System.out.println("sayi2:" + sayi2);

        int sayi4 = ++sayi1;  //1- sayi1 1 arttırılacak
                             //2- sayi1 sayi4 e atanacak

        /*
        eger ++ veya --variable'dan önce ise buna pre... denir.
        bu durumda o satirda yapilan
        iki islemden oncelikli olan artirma vaya azaltmadir.

         */

        System.out.println("sayi1:" + sayi1);
        System.out.println("sayi4:" + sayi4);


    }
}
