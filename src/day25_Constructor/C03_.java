package day25_Constructor;

public class C03_ {
    /*
    Poje oluştururken bazı classlar run etmek için değil variable ve method oluşturup
    bunları baka classlardan kullanmak için oluşturulur
     */

    /*
    Default constructor, parametresizdir
    goremezsek bile ihtiyaç oldugunda çalışır

    Class içerisinde parametreli veya parametresiz herhangi bir constructor oluşturursak java
    default constructor'ı siler
     */
    C03_(){

    }
    /*
    oluşturdugumuz parametresiz bu constructor default constructor ile birebir aynıdır
    ama biz oluşturdugumuz için buna default constructor demeyiz parametresiz constructor deriz.
     */
    String isim="Etka";

    public void method01(){
        System.out.println("C03 method çalıştı");

    }
}
