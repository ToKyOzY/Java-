package me03_Exercise;

public class Z04_MethodCreation {
    public static void main(String[] args) {

       //girilen input olarak verilen 4 harfli bir Stringi tersten yazdiran bir method oluşturalım

        terstenYazdir("yusuf");

    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(4)+
                        input.substring(3,4)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);


    }


}
