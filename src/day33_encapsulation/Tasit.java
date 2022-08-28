package day33_encapsulation;

public class Tasit {

   private String tasitturu;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitturu() {
        return tasitturu;
    }
    //getter method'u da tek satirlik islem yapiiyor
    //baska class'larin private oldugu icin erisemedigi tasit
    //turu bilgisini class icinden alip
    //istenen farkli class'lara return ediyor

    public void setTasitturu(String tasitturu) {
        this.tasitturu = tasitturu;
    }
    //return olmadığı icin bu methodun cağırıldığı
    // tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir
    // satırlık islemde bizim gönderdiğimiz
    // parametreyi instence variable a atıyor.

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    //boolean cariable'lar icin olusturulan
    //getter method ismi -is- ile olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
