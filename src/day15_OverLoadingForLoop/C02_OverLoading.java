package day15_OverLoadingForLoop;

public class C02_OverLoading {
    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz methodlarin isminin yaptigi islev ile
        uyumlu olmasini isteriz
        mesela bir stringin bir bolumunu almak icin Java
        2 adet substring() method'lari veya
        verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() methodu var.

        Java ayni isimde birden fazla method varsa hangisinin
        kullanılacağını paramatrelerin data türüne göre karar verir

         */

        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str=str.replace('c','v');
        str.replace("J","H");
        //str.replace(5,8)

        /*
        ayni isimde ama farkli methodlari olusturmak icin
        degistirebilecegimiz syler
        1- parametre sayisi
        2- ayni sayida parametreye sahip olssa bile
        parametrelerin data turleri
        3- ayni sayida ve ayni data turunde parametreleri alan methodlarda parametrelerin siralanisi
         */
    }
}
