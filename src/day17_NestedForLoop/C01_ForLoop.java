package day17_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*not: tekrar miktarı belirli olan veya bitiş sartı ile başlangıç
        şartı aynı olan variable2a bağlı olan döngülerde genellikle for loop kullanırız

         */

        /*verilen String'deki kullanılan harfleri
        tekrarsız olarak yazdırıp kelimede kullanılan farklı harf sayısını
        veren bir method yapımız

         */
        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); //javaherzamanguzel
        System.out.println(input.substring(0,1));//j
        benzersizInput+=input.substring(0,1);//j

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }


        }
        System.out.println("");
        System.out.println("input :"+input);
        System.out.println("benzersiz input :"+benzersizInput);

    }
}
