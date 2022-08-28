package day35_InharitanceDaConstructorKullanimi;

public class Child extends BParent {
    String isim="AChild isim belirtilmedi";
    protected String childClupAdi="Child clup";
    Child(){
        System.out.println("Child constructor calisti");

    }

    public static void main(String[] args) {
        AGarandParent gp1=new AGarandParent();
        //bu objeyi olusturmak icin grandpa cons. calisir.
        //Parent veya child cons. calismaz

        Child child1=new Child();
        child1.granpaClupAdi="Child1";
        child1.parentClupAdi="Child2";

        // child1 objesi icin Child cons calisir

        /*
        Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik

        Java inharitance'da parent class'lardaki
        ozellikleri kullanabilmek icin
        o class'larin constructor'larini
        otamatik calistiran bir yapi kurmustur

        Ornegin biz child class'inda
          Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz
          Java Child(){} gordugunde
          once parent'in constuctor'ini calistirmam lazim der
          buradan Parent cons'a gider
          Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.
          calismasi gerekir der
          Boylece extends keyword olmayan class'a kadar gider
          ve oradan baslayarak tum constructorlari
          asagi dogru calistirir


         */
    }
}
