package me02_Exercise;

public class Z05_StringManiplationLengthIndex {
    public static void main(String[] args) {
        /*lenght = 0 dan başlamaz kaç karakter varsa onu döndürü
        index ise = 0 dan başlar
        en buyuk index=str.lenght()-1

         */

        String str="Java ogren isi kap";

        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3)); //sondan ikinci karkater


        String str2="Java ogrenmek cok guzel";
        System.out.println(str2.indexOf("o"));
        System.out.println(str2.indexOf('g'));
        System.out.println(str2.indexOf("t"));

        String str5="hjlhajndjfnfhjhuoaahalfhajfhuhruehrj";

        //str5'de p var mi

        if (str5.indexOf("p")==-1){
            System.out.println("yok");
        }else {
            System.out.println("var");
        }

        System.out.println(str2.indexOf("mek"));

        System.out.println(str2.indexOf("g",6+1));

        //str da 2. ve3. e 'nin indexlerini bul

        int ilke=str2.indexOf("e");
        int ikincie=str2.indexOf("e",ilke+1);

        System.out.println(ikincie);
        /*
        eger 2. e varsa 3. e'nin olup ıolmadigini
        ve varsa indexini yazdiralim

         */

        if (ikincie==1){
            System.out.println("ikinci e yok");

        }else {
            int ucuncue=str2.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("ucuncu e yok");
            }else {
                System.out.println(ucuncue);
            }
        }



    }
}
