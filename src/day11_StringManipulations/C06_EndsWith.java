package day11_StringManipulations;

public class C06_EndsWith {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */

        String input ="ftih@gmail.com";

        if (!input.contains("gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (input.endsWith("gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
