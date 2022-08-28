package day12_StringManipulations;

public class C05_Substring {
    public static void main(String[] args) {
         //kullanıcıdan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdırın

        String input="Veli";

        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println(tersInput);




    }
}
