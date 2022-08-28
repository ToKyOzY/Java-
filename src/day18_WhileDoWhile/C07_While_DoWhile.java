package day18_WhileDoWhile;

import java.util.Scanner;

public class C07_While_DoWhile {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
        */
        Scanner scan=new Scanner(System.in);
        boolean kontrol=false;
        String sifre="";
        // kullanicidan dogru sifre gelinceye kadar yeni sifreler almayi do-while ile yaptim
        // sifre kontrolunu ayri bir method'da yapip main method'u basit ve anlasilir yaptim
        do{
            System.out.println("Lutfen bir sifre girin");
            sifre= scan.nextLine();
            kontrol=sifreyiKontrolEt(sifre);
        }while(kontrol==false);
        System.out.println("sifreniz Kabul edilmistir");
    }
    public static boolean sifreyiKontrolEt(String sifre) {
        // tum sartlar icin bir kontrol olusturdum
        boolean kucukHarfKontrol = false;
        boolean buyukHarfKontrol = false;
        boolean ozelKarakterKontrol = false;
        boolean uzunlukKontrol = false;
        boolean sifreKontrolSonuc = false;
        if (sifre.length() >= 8) {
            uzunlukKontrol = true;
        }
        // herhangi bir harf kucuk harf, buyuk harf veya ozel karakter olsa
        // sart saglanmis olacak, bunun icin tum harfleri tek tek gozden gecirip
        // herhangi bir sarti sagladiysa onun kontrolunu true yaptim
        String ozelKarakterler = "!@#$%^&*()_+-=<>?`~/,.|";
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                kucukHarfKontrol = true;
            }
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                buyukHarfKontrol = true;
            }
            if (ozelKarakterler.contains(sifre.substring(i, i + 1))) {
                ozelKarakterKontrol = true;
            }
        }
        // kontrol sonuclandi, hatalari yazdirdim
        if (kucukHarfKontrol==false){
            System.out.println("Sifreniz kucuk harf icermeli");
        }
        if (buyukHarfKontrol==false){
            System.out.println("Sifreniz buyuk harf icermeli");
        }
        if (ozelKarakterKontrol==false){
            System.out.println("Sifreniz ozel karakter icermeli");
        }
        if (uzunlukKontrol==false){
            System.out.println("Sifreniz en az 8 karakter olmali");
        }
        // sifrenin basarili olmasi 4 sartin da true olmasi ile mumkun
        sifreKontrolSonuc=  kucukHarfKontrol&&
                buyukHarfKontrol&&
                ozelKarakterKontrol&&
                uzunlukKontrol;
        // genel kontrol sonucunu main method'a dondurdum
        return sifreKontrolSonuc;

    }

    }