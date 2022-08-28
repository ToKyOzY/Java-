package day11_StringManipulations;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="kolay";

        /*
        verilen kelime icin asagidaki sartlardan uygun olani yazan
        bir program yaziniz
        * verilen kelime cumlede kullanilmamiş
        * verilen kelime cumlede sadece1 kee kullanılmış
        * verilen kelime cumlede birden fazla kullnilmiş

         */

        int kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullamnlmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else{
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");

        }
    }
}
