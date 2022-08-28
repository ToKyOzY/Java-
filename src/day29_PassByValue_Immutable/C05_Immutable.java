package day29_PassByValue_Immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="Mine";

        isim=isim.toUpperCase();

        System.out.println(isim);

        isim="Mevlut";

        System.out.println(isim);


        for (int i = 0; i <100 ; i++) {
            isim+=".";

        }
        System.out.println(isim);

    }
}
