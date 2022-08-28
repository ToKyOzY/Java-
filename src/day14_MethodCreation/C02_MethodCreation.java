package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        verilen 3 basamakli bir sayinin rakamlari
        toplamini yazdıran bir method olusturalim

         */

        int input=423;
        rakamlariTopla(input);

    }
    public static void rakamlariTopla(int input){

        int birlerBasamagi=0;
        int rakmlarToplami=0;

        birlerBasamagi=input%10;
        rakmlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakmlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakmlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdigniz " + input+ " sayisinin rakamlar toplami :"+rakmlarToplami);


    }
}
