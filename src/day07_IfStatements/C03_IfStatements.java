package day07_IfStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        bir if satatment'da curly braces kullanilmazsa java
        ilk satiri sart baglar,sonraki satırlar bağımsız olur.
        { olmazsa ilk satiri es gecer digerleri muhakkak calişir

        eger birden fazla satir ayni if sartina baglanmişsa mutlaka { kullanmaliyiz.
         */
        int sayi=23;

        if (sayi>0)
            System.out.println("sayi pozitif"); //degere bagli
            System.out.println("pozitif kalacaktir"); //her zaman calisir
        System.out.println("ucuncu satir"); // her zaman calişir

        if (sayi%2==0)
            System.out.println("sayi cift"); //degere bagli
            System.out.println("cift kalacaktir"); //her zaman calişir

        if (sayi%5==0)
            System.out.println("sayi %2in tam kati"); //deger bagli


    }
}
