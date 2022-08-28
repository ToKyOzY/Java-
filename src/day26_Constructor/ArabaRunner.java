package day26_Constructor;

import day25_Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir gun onceki car class'indan obje olusturalim
        /*
        farkli bir package'daki bir class'dan obje olusturdugumuzda
        access modifier'lari da dikkate almaliyiz
         */
        Car car1=new Car();
        System.out.println(car1.fiyat);

        /*
        Araba class'indan bir obje oluşturdugumda
        eger default constructor kullanıldıysa
        tüm özellikler için tek tek değer atamak zorunda kalırız

         */
        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("");
        System.out.println("Araba1 bilgileri\nMarka : "+araba1.marka+"\nModel : "+araba1.model
                +"\nYil : "+araba1.yil+"\nFiyat : "+araba1.fiyat);



                /*
                eger bir objeyi oluştururken bazi öalelliklerini argument olarak belirtip
                o özelliklerde bir obje oluşturmak istersek Java itiraz eder.
                çünkü her class'da default constructor vardır
                ama o da parametresizdir
                bizim yeni ve parametreli constructor(lar)'a ihtiyacımız var
                 */

        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 bilgileri\nMarka : "+araba2.marka+"\nModel : "+araba2.model
                +"\nYil : "+araba2.yil+"\nFiyat : "+araba2.fiyat);


    }
}
