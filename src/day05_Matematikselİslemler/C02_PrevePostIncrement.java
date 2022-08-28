package day05_Matematikselİslemler;

public class C02_PrevePostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment:"+ ++sayi); //11

        System.out.println("post-increment:"+ sayi++); //11

        System.out.println("post-incrementden sonra:"+sayi); //12

         sayi++; //13

        ++sayi;  //14
    }
}
