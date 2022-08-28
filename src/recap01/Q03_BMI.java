package recap01;

import java.util.Scanner;

public class Q03_BMI {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz : ");
        double kilo= scan.nextDouble();

        System.out.println("lutfen boyunuzu giriniz : ");
        double boy= scan.nextDouble();

        System.out.println("kitle indeksi : " +kilo/(boy*boy));
    }
}
