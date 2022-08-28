package day36_InharitanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Yan Hizmetlere %30 indirimli ozel sigorta yapilabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki method'u
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding'i nerede dikkate aliyoruz
        bir obje olusturulurken data turu ve cons farkLİ İSE

        eger bir obje olur-sturulurken
       data turu ve cons farkli ise
       objenin ozelliklerini belirlerken
       3 konuya dikkat cekmeliyiz:

       1- obje constructor'in oldugu class'da olusur
       2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
       bu class'da aranan ozellik bulunmazsa parent class'lara bakariz
       orada bulamazsak CTE verir.
       eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz

       3- aranan ozellik method ise
       degeri yazdirmadan once
       override edilmis mi diye kontrol etmemeiz gerekir
       eger override edildiyse en guncel degeri yazdiririz

         */

        BMuhasebe yh1=new EYanHizmetler();
        System.out.println(yh1.gunlukMesai);//M 8
        System.out.println(yh1.saatUcreti);//M 10
        yh1.maas();//YH
        yh1.ozelSigorta();//M
        yh1.sigorta();//P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
       // System.out.println(yh1.issizlikSigortasi);
        //aramaya muhasebeden basladigimizdan
        //issizlikSigortasi bulamayinca CTE verir.

    }

}
