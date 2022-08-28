package dayy04_Practice;

public class Q05_ForLoop {
    public static void main(String[] args) {
        //0-255 e kadar olan harflerin ,
        // sayı ve harf değerini ekrana yazdırınız.
        System.out.println("for ile");
        for (int i = 0; i <=255 ; i++) {
            char c=(char)i;//casting yaptık , sayi harf ve karakter
            System.out.println(i+ " -> "+ c);

        }
        System.out.println("while ile");
        int i=0;
        while (i<=255){
            char sembol=(char)i;
            System.out.println(i+ " -"+sembol);
            i++;
        }
        System.out.println("do while ile");
        int a= 0;
        do {
            char k=(char)a;
            System.out.println(a+ " "+k);
            a++;

        }while (a<=255);

    }
}
