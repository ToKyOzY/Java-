package me03_Exercise;

public class Z05_MethodCreation {
    public static void main(String[] args) {
        //verilen 3 basamakli bir sayinin rakamlar
        //toplamini yazdiran bir method

        int input=423;

        rakamlariToplama(input);
        



    }

  public static void rakamlariToplama(int input) {

        int birlerBasamagi=0;
        int rakamlarTop=0;

      birlerBasamagi=input%10;
      rakamlarTop+=birlerBasamagi;
      input/=10;

      birlerBasamagi=input%10;
      rakamlarTop+=birlerBasamagi;
      input/=10;

      birlerBasamagi=input%10;
      rakamlarTop+=birlerBasamagi;
      input/=10;


      System.out.println(rakamlarTop);




  }


}
