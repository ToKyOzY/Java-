package day36_InharitanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{
    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("personel minumum : "+(30*gunlukMesai*saatUcreti)+" maas alir");

    }
    protected void ozelSigorta(){
        System.out.println("Isteyen calisanlara %50 indirimli ıozel sigorta yapilir");
    }

}
