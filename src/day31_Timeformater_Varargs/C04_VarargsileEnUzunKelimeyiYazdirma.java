package day31_Timeformater_Varargs;

public class C04_VarargsileEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("ali","Ayse","Ismail","Ahmet","Babayigit");
    }

    private static void enUzunKelimeyiYazdir(String... kelime) {

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
