package day42_AbstractClass_Interface;

public interface I03_Interfaces {

    int SAYI=20;
    //int sayi;
    //Interface'lerde tum variable'lar public,static veya final'dir
    //sonradan bir variable olusturdugumuzda mutlaka deger atamaliyiz
    /*
    Bir interface bir class'i parent edinemez..
     */

    void yakit();
    /*
    Interface icerisindeki her method
    public abstract static ozelliklere sahiptir

    abstract bir methodun body'si olmasi mumkun degildir
    Java sonradan developer'larin istegi uzerine kismi bir update yapmıstir

    Bir interface'e sonradan bir abstract method eklerseniz
    o interface'i daha once implement etmis tum class'lara gidip
    hepsine yeni eklenen method'u override ermemiz gerekir
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir

    Bunu icin Java Java8'den itibaren
    interface'lere sonradan body'si olan method eklenmesine izin vermistir

    Bu method'larin body'si olsa da ınterface'in yapisi geregi
    bu method'lara concrete denmez
    body'si olan bu method'lar istisna olarak kabull edilir..

     */
    public void motor();
    public abstract void teker();



}
