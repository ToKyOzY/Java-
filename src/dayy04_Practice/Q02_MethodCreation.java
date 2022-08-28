package dayy04_Practice;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
        /*
        cm olarak verilen bir sayiyi, metre ve kilometreye
        donusturen bir method yaziniz
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("metre ve km'ye donusturmek istediginiz cm degerini giriniz");
        double santiMeterValue=scan.nextDouble();

        converSM(santiMeterValue);



    }

    private static void converSM(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kMeter=santiMeterValue/100800;
        System.out.println("girdiginiz cm degeri : "+santiMeterValue+" : "+meter+" m dir. "+kMeter+" km dir.");
    }
}
