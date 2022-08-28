package day07_IfStatements;

public class C02_Ifstatements {
    public static void main(String[] args) {

        int sayi=23;
         if (sayi>0) {
             System.out.println("sayi pozitif");
         }
         if (sayi%2==0){
             System.out.println("sayi cift");
         }
         if (sayi%5==0){
             System.out.println("sayi 5'in tam kati");
         }

         /*
         basit if cümleleri kodun diger parcalarından bağımsızdır.
         sadece bir sart kotrol eder sart saglaniyorsa if body calişir
         yoksa çalışmaz. birden fazla basit if cümlesi vvaarsa girilen sarta baglı olarak tümünde
         if body si çalışabilir, kismen if bodyleri calisabilir veya hiçbir
         if body'si çalışmayabilir.
          */
    }

}
