package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //6- bir tamsayı, bir de char değişken oluşturun
        int sayi=10;
        char harf= 'a';
        String str= "banan";
        System.out.println(sayi+harf); //10a değil 107oldu
        System.out.println(str+harf); //banana
        System.out.println(sayi*harf);
        System.out.println(harf+2);
        System.out.println(str + sayi+ harf); //banan10a

        // char yeniHarf= harf+2;
        /*
        1- char data turu işleme girfiği değişkenin türüne göre farklı davranabilir.
        eğer matematiksel işleme girdiği variable sayısal bir değerse sayı gibi davranır

        char yeniHarf= harf+2; java önce sağdaki işlemi yapar, sağda int+char görünce ascii değerini alır sonra atama işlemini yapar.
        char yeniHarf= 99
        bu atama java açısından kabul edilebilir değildir.

        2_str+harf); //banana = string variable çok güçlüdür. neyle işleme girerse girsin hemen kendine benzetir.
                     stringle sayıyı toplarsanız string olan banan10 olur.
         */
        //peki... consolda 10a görmek istersek nasıl yazdırmalıyız verilen variable ları kullanarak

        System.out.println(" "+sayi+ harf); //10a başına string gelirse "": hiçlik (stringin gücünü devreye sokmak için başına boş çift tırnak getiririz)


        char deger= '1';
        System.out.println(deger+harf); //'1' + a ----> 49+ 97= 146
        // 1 'in ascii değeri 49 a Nın ascii değeri 97


    }
}
