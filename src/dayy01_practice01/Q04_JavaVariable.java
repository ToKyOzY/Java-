package dayy01_practice01;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme

        int yas = 33;
        double boy = 1.60;
        System.out.println("boy = " + boy);
        System.out.println("yas = " + yas);

        // To copy the variable's value

        int yasim = 36;
        int muhsinYasi = yasim;
        System.out.println("muhsinYasi = " + muhsinYasi);
        System.out.println("yasim = " + yasim);


        // you can declare multiple variables in the same line

        int yil = 2022, ay = 6, gun = 20;

        System.out.println("yil = " + yil);


        // updating a variable

        yil = 2032;
        System.out.println("update yil = " + yil);


        //Bir degisken tanimlayin : x



        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; //deklarasyon
        int y= 2000; //initialize
        x=30; //x'in initialize
        y=1; //guncelleme

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
