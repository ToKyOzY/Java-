package dayy10_Practice_Okul_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giris {
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

    public static void main(String[] args) {
        System.out.println("Hos Geldiniz okulumuza");
        System.out.println("isim giriniz :" );
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        System.out.println("Soyisim giriniz :" );
        String soyisim=scan.nextLine();

        System.out.println("Yasinizi giriniz :" );
        int yas=scan.nextInt();

        System.out.println("Bransinizi giriniz : " );
        scan.nextLine(); //dummy hayalet komut
        String brans=scan.nextLine();



        System.out.println("telefon numaranizi giriniz : " );
        String telNo= scan.next();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,telNo);

        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }



}
