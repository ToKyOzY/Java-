package day25_Constructor;

public class Car {
    /*
    bu class bizim kalıphanemiz
    bir araba oluşturmak için ihtiyacımız olan variable ve method'ları bu class da belirleriz

    sonra farklı class'larda araba oluşturmamız gerekirse
    bu classtan bir obje oluşturup burada belirlenen variable ve method'lara göre araba üretiriz
     */

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
}
