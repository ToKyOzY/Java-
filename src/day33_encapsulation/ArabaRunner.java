package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 abjesi uzerinden marka variable'ina
        //ulasabildim, yazdirabildim(get), degistirebildim(set)

        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //acsess modifier kullanarak marka variable'ına ulasiriz
        //tamaen serbest yapabilir ya da tamaen engelleyebilirim
        //private yaptigimiz modele ise hic ulasamayiz
        //access modifier ya hap ya hic der

        //modeli degisstirelim ama goremeyeilim
        //yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
         //1. adim:ozel yetki tanimlayacaginiz variable'lari  private yapin
        //private bir dataya baska class'lardan ulasmak mumkun olmadıgından
        //2. adim: set yetkisi icin setter, get yetkisi icin getter olusturalim


        arb1.setModel("supra");
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit());
        // yakiti degistiremeyiz cunku setter method'u yok


    }
}
