package day34_Inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornegin parent class'daki private class uyelerini child class'dan kullanmayiz
        ayni sekilde parent ve child farkli package'larda ise
        parent class'daki default access modifier'i olan class uyelerini child class'dan kullnamayiz
         */
        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);

    }
}
