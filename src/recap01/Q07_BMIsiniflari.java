package recap01;

import java.util.Scanner;

public class Q07_BMIsiniflari {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz :");
        double boy=scan.nextDouble()/100; //boyu metreye ilk etapta cevirmis olduk

        System.out.println("kilonuzu kg olarak giriniz :");
        double kilo= scan.nextDouble();

        double bmi=kilo/(boy*boy);
        
        if (bmi<=20){
            System.out.println("bmi indeksiniz "+bmi+ " oldukca zayifsiniz");
            
        } else if (bmi<=25) {
            System.out.println("bmi indeksiniz "+bmi+ " normal sinirlardasiniz");
        }else if (bmi<=30){
            System.out.println("bmi indeksiniz "+bmi+" sisman kategorisindesiniz");

        }else if (bmi>30){
            System.out.println("bmi indeksiniz "+bmi+" obez grubundasiniz");

        }

    }
}
