package day32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        //verilen bir input'u tersine cevirip
        // bize donduren bir method olusturun

        String inputt="Hey gidi for loop gunleri";

        String tersInput=tersineCevir(inputt);
        System.out.println(tersInput);




    }

    private static String tersineCevir(String inputt) {


        StringBuilder sb=new StringBuilder(inputt);

        return sb.reverse().toString();



    }
}
