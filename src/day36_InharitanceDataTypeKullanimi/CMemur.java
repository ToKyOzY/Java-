package day36_InharitanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{
    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" mmas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlara %60 indirimli ozel sigorta yapilabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();//Personelden alacak
        System.out.println(mmr1.isim);//Personelden alacak
        System.out.println(mmr1.soyisim);//Personelden alacak

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        her ne kadar Memur class'inda olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe

        String str="murat";
        ArrayList<Integer>list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir
        yani data tururdur

         */
        System.out.println(mhsb1.gunlukMesai);//8 Muhasebe
        System.out.println(mhsb1.saatUcreti);//10 Muhasebe
        mhsb1.maas();//muhasebe
        mhsb1.ozelSigorta();//muhasebe
        mhsb1.sigorta();//Personel
        System.out.println(mhsb1.isim);//Personel
        System.out.println(mhsb1.soyisim);//Personel


    }
}
