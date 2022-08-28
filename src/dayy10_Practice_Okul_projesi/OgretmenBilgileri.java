package dayy10_Practice_Okul_projesi;

public class OgretmenBilgileri {

String isim;
String soyisim;
int yas;
String brans;
String telNo;

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;
    }

    public OgretmenBilgileri() {
    }

    @Override
    public String toString() {
        return
                "\nisim= " + isim  +
                "\nsoyisim= " + soyisim  +
                "\nyas= " + yas +
                "\nbrans= " + brans +
                "\ntelNo= " + telNo ;
    }
}
