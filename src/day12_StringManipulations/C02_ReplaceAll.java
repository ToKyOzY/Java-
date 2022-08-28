package day12_StringManipulations;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'ı bugun java cok guzel haline getirin
        //replaceall methodundaki all'un amacı aynı özellikteki tüm
        // karakterleri kapsamasıdır.
        //butun özel karakterleri sil

        //tum özel karakterleri silelim dedigimizde space'larde siliniyor.
        //space'leri krumak icin en basta oların yerine cumlede bulunmayacak bir string koyalim
        //"qazvsx"

        str=str.replace(" ","qazvsx");
        System.out.println(str);
         str=str.replaceAll("\\W","");
        System.out.println(str); //

        str=str.replaceAll("\\d","");

        //istenmeyen özel karakter ve sayılardan kurtulduk
        //simdi spaceleri geri getirelim

        str=str.replace("qazvsx"," ");

        System.out.println(str);

    }
}
