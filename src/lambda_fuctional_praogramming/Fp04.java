package lambda_fuctional_praogramming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {

        System.out.println(get7Den100eToplam());
        System.out.println(get7Den100eToplam2());
        System.out.println(get2Den11eCarp());
        System.out.println(faktoriyelHesapla(5));
        System.out.println(verilen2SayiArasindakiCiftSayilarinToplami(11,5));
        System.out.println(ikiSayiArasindakiTumRakamlarinToplami(23,32));

    }
    //1- 7'den 100'e kadar integer degerlerinin toplamini bulan bir method oluşturun

    //1.Yol:
    public static int get7Den100eToplam(){
       return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    //2. Yol:
    public static int get7Den100eToplam2(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }

    //2- 2'den 11'e kadar integer degerlerinin carpımını buln bir method oluşturun
    public static int get2Den11eCarp(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }

    //3- verilen bir sayinin faktoriyelini hesaplayan bir method olusturun.(5 faktorial =1*2*3*4*5 ==> 5! )

    public static int faktoriyelHesapla(int x){
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //4- Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int verilen2SayiArasindakiCiftSayilarinToplami(int x, int y){
        int z=0;
        if (x>y){       // eger x y'den buyuk olursa diye swap yapiyoruz
            z=x;
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemanlariSec).sum();
    }
    //5- verilen 2 sayi arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun
    //23 and 32 ==> 2+3 + 2+4 + 2+5 + 2+6 + 2+7 + 2+8 + 2+9 + 3+0 + 3+1 + 3+2 ==> 68
    public static int ikiSayiArasindakiTumRakamlarinToplami(int x, int y){
        int z=0;
        if (x>y){
            z=x;
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplami).sum();
    }
}
