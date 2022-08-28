package day30_Immutable;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String  str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2); //false
        System.out.println(str1.equals(str2)); //true

        System.out.println(str1.equals(str3)); //true
        System.out.println(str1==str3); //false

        System.out.println(str2.equals(str4)); //true
        System.out.println(str2==str4); //false
        /*
        yeni bir String olustururken
       1- esitligin saginda new keyword'u olursa Java direkt yeni bir obje ve referans olusturur

        2- eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa
        String immutable oldugundan degisikligi kaydetmek uzere
        bu yeni kopyaString ve referans olusturur, sonra degeri hesaplayip
        bu yeni kopya objenin icine kayar.

        bire bir aynisi yoksa yeni bir obje ve referans olusturur
         */
        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5)); //true
        System.out.println(str1==str5); //true

        System.out.println(str1.equals(str6)); //true
        System.out.println(str1==str6); //true

        /*
        eger yeni String objesi olusturulurken
        new kelimesi kullanilmaz veya
        esitligin saginda bir islem olmazsa Java bakar.

        */

    }
}
