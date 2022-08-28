package day04_DataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=50;
        short sayi2= (short) sayi1;

        // geniş data turundeki değeri dar data turundeki
        //variable'a atamak isterseniz java sizin geniş data
        //türündeeki değerin dar data turun sınırlarına uyup
        // uymayacağını çalıştırana kadar bilemez.
        //bu durumda riski bilemez sorumluluğu kabul etmemizi ister.
        //bunun için değerin önüne data türünü parantez içinde yamak yeter.
    /*
    iki tane risk var bu riskleri üstlendiğimizde
    3 durum oluşabilir.
    1.bizim değerimiz dar kalıp değerlerine uygun olursa hiç kayıp olmadan
    cost olur
    2. double bir sayıyı int'e cost etmek gibi
    durumlarda data kaybı yaşayabilirsiniz.
     3. geniş kalıp değeri dar kalıba koyduğunuzda sınırları aşan durumlarda
    veri başkalaşabilir.
 */
        System.out.println(sayi2);

    }
}
