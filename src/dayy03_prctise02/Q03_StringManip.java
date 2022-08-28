package dayy03_prctise02;

import java.util.Scanner;

public class Q03_StringManip {
    public static void main(String[] args) {
        /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter
iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str=scan.next();

        char ortancaK=str.charAt((str.length()-1)/2);

        if (str.length()%2==1 && str.length()>=3){
            System.out.println("ortanca karakter : "+ortancaK);
        }

    }
}
