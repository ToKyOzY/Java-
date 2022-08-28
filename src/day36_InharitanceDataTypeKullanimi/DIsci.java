package day36_InharitanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Iscilere %70 indirimli ozel sigorta yapilabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturulurken data turu ve cons ayni
        class'dan ise
        direkt o class'a gidiyorduk

        eger data turu ve cons farkli ise
        obje constructor'ın oldugu Class'in objesidir
        ancak, bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki
        tum calisanlarla beraber sahip oldugu
        genel ozellikleri yazdirir


         */
        System.out.println(isc1.gunlukMesai);//M 8
        System.out.println(isc1.saatUcreti);//M 10
        isc1.maas();//M
        isc1.ozelSigorta();//M
        isc1.sigorta();//P
        System.out.println(isc1.isim);//P
        System.out.println(isc1.soyisim);//P


        APersonel isc2=new DIsci();

      //  System.out.println(isc2.gunlukMesai);//M 8
      //  System.out.println(isc2.saatUcreti);//M 10
        isc2.maas();//M
       // isc2.ozelSigorta();//M
        isc2.sigorta();//P
        System.out.println(isc2.isim);//P
        System.out.println(isc2.soyisim);//P
        /*
        eger data turu olan class'da aradigimiz ozellik yoksa
        onun parent'ina gidebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */
        List<String > list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi linkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */


    }
}
