package day16_ForLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        /*
        başlabgıç noktasındn sonra
        bitiş şartına yaklaşmıyorsak sonsuzluk loop'a girer

        for (int i = 0; i >-10 ; i++) {
          System.out.print(i);
        }
         */



        //eger ilk deger için bile bitiş sağlanmıyorsa
        //for loop çalışır ama loop body'si hiç bir zaman devreye girmez.

        for (int i = 0; i > 5; i++) {
            System.out.println(i);

        }

    }
}

