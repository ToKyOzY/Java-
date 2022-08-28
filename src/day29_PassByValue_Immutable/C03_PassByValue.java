package day29_PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir List olusturlim
        2 ayri method'dan birinde sadece elemanlari degistirelim

        digerinde yeni bir List atayip
        ayni sayida yeni eleman ekleyelim

        ve her 2 method call'dan sonra kendi listemizi
        main method icerisinde kontrol edelim
         */
        List<String > list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list :"+list);

        elemanlariDegis(list);
        System.out.println("eleman degistir method'undan sonra : " + list);

        listDegistir(list);
        System.out.println("list degistir method'undan sonra list :" +list);
    }

    private static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("nutella");
        list.add("cay");
        list.add("cokokrem");

        System.out.println("list degistir method'unda list : "+list);
    }

    private static void elemanlariDegis(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("eleman degistir methodunda list : "+list);

    }
}
