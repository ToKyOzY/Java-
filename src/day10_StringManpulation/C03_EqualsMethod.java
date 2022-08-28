package day10_StringManpulation;

public class C03_EqualsMethod {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can"+ "";
        String str4="ALİ Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); //true
        System.out.println(str1.equals(str3)); // true

        System.out.println(str1==str5); // false
        System.out.println(str1.equals(str5)); //true

        System.out.println(str1.equals(str4)); //false
        System.out.println(str3.equals(str5)); //true

        /*
        stringlerde == her zaman aynı string olsa bile == calişmaz
        emin olmak isterseniz equals methodunu kullanmalisiniz

        equals kullandiğimizda dikkat edecegimiz tek sey
        metinlerin bire bir ayni olmasidir.
         */

    }
}
