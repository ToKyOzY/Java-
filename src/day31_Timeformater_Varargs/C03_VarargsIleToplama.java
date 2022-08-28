package day31_Timeformater_Varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi--> bu gosterim int variable'lerden olusan bir varargs demektir
        varargs array slt yapisini kullanir
        
         */
        int top=0;
        int sayiAdedi= sayi.length;
        for (int each:sayi
             ) {
            top+=each;
        }
        System.out.println("girilen "+sayiAdedi+" sayilarin toplami: "+top);


    }
}
