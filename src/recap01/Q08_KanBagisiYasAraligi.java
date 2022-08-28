package recap01;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriiniz :");
        int yas= scan.nextInt();
        System.out.println("kilonuzu giriniz :");
        int kilo=scan.nextInt();

        if (yas>0 && yas<18){
            System.out.println("kan bagisi yapamazsiniz");

        } else if (yas>=18 ) {
            if (kilo<50){
                System.out.println("kan bagisi yapamazsiniz");
            }else
                System.out.println("kan bagisi yapabilirsiniz");
            }


        }
    }

