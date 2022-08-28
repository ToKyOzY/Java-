package day29_PassByValue_Immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :değiştirilemez
        mutable : degistirilebilir

        en meshur Immutable class : String

         */
        String str="Yildiz Bank";

        System.out.println(str.toUpperCase());

        str.toLowerCase();

        System.out.println(str);

        str.substring(3,5); //sout olmadigindan yazdirmz

        System.out.println(str);

        /*
        Java'da String gibi metin ifadelerde kullanabilecegimiz
        mutable StringBuiilder Class'i vardir

         */
        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.append(".");
        System.out.println(sb);

        //StringBuilder-->mutable




    }
}
