package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati));//90

        /*
        iki farki method'da satis fiyati isminde variable olabilir
        java buna itiraz etmez
        cunku scope'lari farklidir

         */
    }
    public static double indirimliFiyat(double orjinalFiyat){
        //methdumuz %10 indirim yapip
        //yeni fiyati main method'a döndürsün
        double satisFiyati=orjinalFiyat*0.9;



        return satisFiyati;
    }
}
