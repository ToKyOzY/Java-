package day17_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen en ve boy degerine göre yıldızlardan oluşan bir
        dikdörtgen oluşturalım
        yukseklik :3 boy :4
        ****
        ****
        ****
         */

        //dışardaki outer loop, içerdeki inner loop
        int yukseklik = 4;
        int boy = 8;

        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
