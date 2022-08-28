package day19_Scope;

public class C02_ClassVariables {
    public static void main(String[] args) {
        /*
         Farkli bir class'da calisirken
         her hangi bir class adini yazip .'ya basarsak
         adini yazdigimiz class'daki tum STATIC class uyelerini gorebilir
         ve kullanabiliriz
         */
        C03_StaticVariables.staticMethod(); // 10
        System.out.println(C03_StaticVariables.staticSayi); //10
        System.out.println(C03_StaticVariables.degersizStaticVar);  // 0
        /*
         Class level variable'lara deger atayip atamamak bize kalmistir
         istersek deger atamasi yapariz, istemezsek deger atamayiz
         Eger Deger atamissak Java atadigimiz o degeri kabul eder
         deger atamazsak Java bu variable'lara default bir deger atamasi yapar
         int --> 0
         String --> null
         boolean--> false
         char --> '' (hiclik)
         */
        /*
         baska class'daki instance variable'lara obje olusturarak ulasabiliriz
         */
        C03_StaticVariables obje1=new C03_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0
        System.out.println(C03_StaticVariables.staticSayi); // 20
        /*
        Farkli bir class'dan C02 clasindan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */
    }
}


