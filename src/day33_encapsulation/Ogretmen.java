package day33_encapsulation;

public class Ogretmen {

    private String isim;
    private String soyIsim;
    private String brans;

      /*
    bazen de yetkileri sinirlamak degilde yapilan isi faha iyi
    tanimlamak icin encapsulation kllanilir
    bu yaklasimi kullanan class'larda
    tum variable2lar private yapilip
    hepsi icin getter ve setter olusturulur
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
