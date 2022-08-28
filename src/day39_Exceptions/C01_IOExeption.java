package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExeption {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da pc deki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'da pc'deki bir dosyaya ekleme veya update yapmak istersek
        FikeOutputStream Class'indan yardim aliriz.
         */
        FileInputStream fis=new FileInputStream("src/day39_Exceptions/test.txt");
        /*
        goruldugu gibi Compile Time'da altini kırmızı cizen her durum
         Compile Time Error degildir
         Java'da bazi Exception'lar da
         Compile Time Exception'dir
         ozellikle dosya okuma ve yazma ile ilgili exception'lar
         compile Time Exception'dir.


         Compile Time Exception oldugunda Java cozum icin 2 ihtimal onerir.
         1- try catch ile cevrelemek
         2- method signature'ina throws keyword ile beklenen exception turunu yazmak

         throws exception saadece olayin farkinda oldugumuzun deklarasyonudur
         exception'in handle edilmesinde hic bir rolu yoktur
         yani try catch ile kontrol altina aldigimiz exception'larda code calismaya devam ediyordu
         ancak throws exception yazdigimizda Java bir exception'la karsilasirsa
         hic bir sey yapmamisiz gibi hata mesaji yayinlayip
         calismayi durdurur.

         throws ve try catch birbirinin alternatifi
         */
  }
}
