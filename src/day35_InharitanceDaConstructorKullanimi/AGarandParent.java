package day35_InharitanceDaConstructorKullanimi;

public class AGarandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
    her class'da gorunmese bile bir constructor vardir
    bu class'dan bir obje olusturmak istedigimizde
    default constructor devreye girecektir

    default constructor'i gozlemleyemeyecegimiz icin,
    onun yerine kullanilabilecek parametresiz
    constructor olusturalim

     */
    protected String granpaClupAdi="GrandPa clup";

    AGarandParent(){
        System.out.println("AGrandParent constructor calisti");
    }
}
