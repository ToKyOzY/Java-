package day42_AbstractClass_Interface;

public abstract class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{
    /*
    bir class'i bir Interface'e child yapmak icin ;Implement keyword'u kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar
    interface ekleyebiliriz..

     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);//20
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(ISIM);

    }
}
