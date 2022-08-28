package day32_StringBuilder;

public class C04_subSequance {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu method String oldugu icin StringBuilderi degistirmez

        System.out.println(sb);

        sb.subSequence(0,3);
        System.out.println(sb);//sout'un icerisinde methodla birlikte yazilmazsa degistirmez

        System.out.println(sb.subSequence(0,3));

    }
}
