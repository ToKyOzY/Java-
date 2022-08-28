package dayy01_practice01;

import java.util.Scanner;

public class Q07_Converting {
    /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */
    public static void main(String[] args) {

        int galon=1000;
        double litre=galon*3.785;
        String sonuc1=galon+" galon degeri " + litre+ " litereye esttir";
        System.out.println(sonuc1);
        // or bu şekilde---> System.out.println(galon+" galon degeri " + litre+ " litereye esttir");

        int l=1000;
        double G=l/3.785;
        System.out.println(galon+" galon degeri " + litre+ " litereye esttir");

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9

        Scanner scan= new Scanner(System.in);
        System.out.print("fahrenayt degerini giriniz: ");
        double fh=scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri : "+(fh-32)*5/9);





    }
}
