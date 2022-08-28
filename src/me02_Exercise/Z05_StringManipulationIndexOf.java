package me02_Exercise;

public class Z05_StringManipulationIndexOf {
    public static void main(String[] args) {

        String str= "Java bilmeden olmaz demiştim sana";

        /*
        str da 1. ve 2. l'nin indexini bul ücüncü l varsa indexini bul
         */

        int ilkL=str.indexOf("l");
        int ikinciL=str.indexOf("l",ilkL+1);

        if (!(ikinciL==-1)){
            int ucuncuL=str.indexOf("l",ikinciL+1);
            if (ucuncuL==-1){
                System.out.println("3. l yok");
            }else {
                System.out.println("ucuncu l'nin indexi : "+ucuncuL);
            }
        }



    }
}
