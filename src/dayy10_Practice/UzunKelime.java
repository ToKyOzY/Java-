package dayy10_Practice;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz : " );
        String cumle=scan.nextLine();

        longestWord(cumle);

        // bun bugun java'yi daha cok sevdim ama cok zorlandim
        System.out.println("longest Word : "+longestWord(cumle));
    }

    public static String longestWord(String cumle) { //en uzun kelimeyi istiyor

        String [] arr=cumle.split(" ");
        int max=0;
        String enUzunKelime="";

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>max){
                max=arr[i].length(); //max ilk calistiginda code max=3 oldu
                enUzunKelime=arr[i];


            }

        }


        return enUzunKelime;
    }
}
