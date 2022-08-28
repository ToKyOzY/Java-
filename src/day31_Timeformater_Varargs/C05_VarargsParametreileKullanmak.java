package day31_Timeformater_Varargs;

public class C05_VarargsParametreileKullanmak {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir(5,"ali","Ayse","Ismail","Ahmet","Babayigit","Zeynep");
    }
    /*
    varargs teorik olark sonsıuz sayida element alabilir
    bir method'da parametre olarak varargs varsa
    varargs'in sinirlarini bilebilmesi icin
    parametrelerin sonuncusu olmalidir
   oncesinde farkli parametreler olabilir ama varargs'dan sonra
   farkli parametreler olamaz

   bir method'da sadece bir tane varargs olabilir.
     */

    private static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerin en uzunu : "+enUzunKelime);

    }
}
