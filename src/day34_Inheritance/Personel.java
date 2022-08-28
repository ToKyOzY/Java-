package day34_Inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ilerde bu class'i parent yapmak isteyenler olabilir
    ozaman variable ve method'larin
     access modifier'ini protected
     boylece sizin child class'lariniz sizden istifade ederken
     child olmayanlar sizin variabale ve method'larini kullanamazlar

     */
//inharitance icin javanın sectigi access modifier--> protected
   protected int personelNo;
    String isim="isim belirtilmedi";
    String deparman="Departman belirtilmedi";



    protected void maas(){
        System.out.println("tum personelin maasi vardir");

    }
    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");

    }
    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }
}
