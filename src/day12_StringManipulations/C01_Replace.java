package day12_StringManipulations;

public class C01_Replace {
    public static void main(String[] args) {

        String str=" Bu gun  hava  cok  guz el ";
        System.out.println(str.replace(" ",""));

        //hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        //guzel yerine harika yapalim

        System.out.println(str.replace("guz el","harika"));

        //cumleyi replace kullanarak bugun java cok guzel yapalım

        str=str.replace("Bu gun","bugun")
                .replace("hava","Java")
                .replace("guz el","guzel" );
        //tama yapinca kalıcı hale getirdik

        System.out.println(str);





    }
}
