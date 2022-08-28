package day27_StaicKeyword;

public class C01 {
    static  int sayi=10;
    int rakam=05;

    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz
        static (class)variable
        instance (obje)variable
        static variable'lar tum class'dan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direkt kullanabilirler
        instance variable'lara static method'dan ılasmak istersek
        obje olusturmamiz gerekir

        instance variable'lar obje variable'i oldugu için
        herhangi bir satırda instance variable'in degerinin ne oldugunu bulmak için
        OBJE OLUSTURLULAN satırdan itibaren code incelenmelidir

        static variable'lar class variable'i oldugu için
        herhangi bir satirda static variable'in degerini bulmak için
        CLASS'IN BASINDAn itibaren code incelenmelidir
         */

        C01 obj1=new C01();
        System.out.println("obj1'nin rakam degeri : "+obj1.rakam); //5
        System.out.println("obj1'nin sayi degeri : "+obj1.sayi); //10

        obj1.rakam+=1; //5+1=6
        obj1.sayi+=1; //10+1=11

        System.out.println("1 arttirdiktan sonra obj1'nin rakam degeri : "+obj1.rakam); //6
        System.out.println("1 arttirdiktan sonra obj1'nin sayi degeri : "+obj1.sayi); //11

        C01 obj2=new C01();
        System.out.println("obj2'nin rakam degeri : "+obj2.rakam); //5
        System.out.println("obj2'nin sayi degeri : "+obj2.sayi); //11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 arttirdiktan sonra obj2'nin rakam degeri : "+obj2.rakam); //6
        System.out.println("1 arttirdiktan sonra obj2'nin sayi degeri : "+obj2.sayi); //12


    }
}
