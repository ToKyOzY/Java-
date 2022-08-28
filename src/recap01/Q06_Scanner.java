package recap01;

import java.util.Scanner;

public class Q06_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isci isi kac gunde bitirmektedir :");
        int birIsciBitirmeSuresi= scan.nextInt();

        System.out.println("toplam kac isci calisacak :");
        int isciSayisi=scan.nextInt();
        
        double cokluBitirmeSuresi=birIsciBitirmeSuresi/isciSayisi;
        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);
    }
}
