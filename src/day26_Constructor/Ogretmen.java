package day26_Constructor;

public class Ogretmen {

    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="tarih belirtilmedi";
    String brans="brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim :" + isim +
                "\nsoyisim :" + soyisim +
                "\ndogumTarihi :" + dogumTarihi +
                "\nbrans :" + brans +
                "\nyanBrans :" + yanBrans ;
    }
}
