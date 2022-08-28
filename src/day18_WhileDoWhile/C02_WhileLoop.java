package day18_WhileDoWhile;

public class C02_WhileLoop {
    public static void main(String[] args) {

        int input=5432;

        int rakamlarTop=0;
        int birlerBasamagi=0;
        int temp=input;

       while (temp>0){
           birlerBasamagi=temp%10;
           rakamlarTop+=birlerBasamagi;
           temp/=10;


       }
        System.out.println(input+ " rakamlar toplamı "+rakamlarTop);


    }
}
