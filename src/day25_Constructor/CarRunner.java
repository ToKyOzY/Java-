package day25_Constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";
        System.out.println("Car1 bilgileri\nMarka : "+car1.marka+"\nModel : "+car1.model
                            +"\nYil : "+car1.yil+"\nFiyat : "+car1.fiyat);

        System.out.println("");
        Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka : "+car2.marka+"\nModel : "+car2.model
                +"\nYil : "+car2.yil+"\nFiyat : "+car2.fiyat);
        /*
        herhangi bir obje üzerinden bir variable yazdırmaya çalıştığımızda java değeri şu sıralama ile arar:
        1- o obje oluşturulduktan sonra bir değer atandı mı ?
        2- objenin oluşturduğu class'da variable'a bir değer atanmış mı bakar
        3- o zaman data türüne göre java default değeri atar
        
         */
    }
}
