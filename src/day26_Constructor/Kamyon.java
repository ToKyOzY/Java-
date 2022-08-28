package day26_Constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
    this.marka=marka;
    this.model=model;
    this.yil=yil;
    this.fiyat=fiyat;
    /*
    bizim temel amacımız KamyonRunner'da argument olarak girilen değerin
    Kamyon class'ında instance variable'a atanmasi
    ancak scope konusunda öğrendiğimiz gibi
    Kamyon constructor scope'unda marka oldugu için
    instance marka'ya gitmiyor

    bu karışıklığı idermek için instance variable'ları belirli hale getirmemiz lazım Java
    bunun için this keyword'u oluşturmuştur

    genel kullanım açısından this keyword'u code'u herkesin anlamasını kolaylaştırdığı için tercih edilir


     */

    }

    public Kamyon(String marka) {
        this.marka = marka;
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }




    @Override
    public String toString() {
        return
                "\nmarka = " + marka  +
                "\nmodel = " + model  +
                "\nyil = " + yil +
                "\nfiyat = " + fiyat ;
    }
}
