package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {


        int a=1000;
        int b=50;
        int sayac=1;
        while (sayac<1000){
            /*
            try bolk'u yapmaya calistigimiz ama risk oldugunu dusundugumuz
            islemleri yazmak icin kullanilir
            catch'den sonraki parantez karsilasmayi bekledigimiz exception
            turunu Javaya soylemek icin kullanir
            catch blogu  : Java'ya soyledigimiz exception(istisnai durum)gerceklesirse
            Java'nin yapmasini istedigimiz islem

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz exception'ı yazabilir
             veya her turlu exception'da devreye girmesini istiyorsak
             tum exception'larin parent'i olan exception yazabiliriz
             */

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu dikkatli ol");
            }


            b--;
            sayac++;
        }
    }
}
