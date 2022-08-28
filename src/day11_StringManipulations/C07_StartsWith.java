package day11_StringManipulations;

public class C07_StartsWith {
    public static void main(String[] args) {

        String input= "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("j")); //true

        System.out.println(input.startsWith("")); //true

        System.out.println(input.startsWith("gun",5)); //true

    }
}
