package day37_Overriding;

public class FCupra extends EToyota{
    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez
        eger child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overriding method olmaz


         */
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silindir motoru kullanir");

        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan 2 method'u surekli kontrol eder
        eger parent class'dki overridden methodunu silerseniz CTE verir

        @Override notasyonu kullanmak mecburi degildir
        eger overriding method silinirse kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */

    }

}
