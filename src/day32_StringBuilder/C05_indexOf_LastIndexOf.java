package day32_StringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attenion please");

        System.out.println(sb.indexOf("Pay"));//0
        System.out.println(sb);
        System.out.println(sb.indexOf("e"));//7
        System.out.println(sb.indexOf("e",10));//15

        System.out.println(sb.lastIndexOf("e"));//18
        System.out.println(sb.lastIndexOf("e",10));//7



    }
}
