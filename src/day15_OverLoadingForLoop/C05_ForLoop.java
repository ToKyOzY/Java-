package day15_OverLoadingForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //1'den 5'e kadar olan(5 dahil) tamsayilari toplayalim

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }

        System.out.println("toplam : " + toplam);

        //10 dahil 20 dahil aradaki sayilari toplayin
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }


        System.out.println("toplam : " + toplam);


        //30dahil 50 dahil aradaki çift sayilari topla
        toplam = 0;
        for (int i = 30; i <= 50; i+=2) {
            toplam += i;
        }
        System.out.println("30-50 arasi çift sayilarin toplami : "+ toplam);
        //2. yontem
        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
            System.out.println("30-50 arasi çift sayilarin toplami : "+ toplam);


        //1500 ile 1600 arasindaki 7'ye bolunabilen sayilarin toplami
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("1500-1600 arasi 7 ile bolunebilen sayilarin toplami : "+toplam);
    }


    }
