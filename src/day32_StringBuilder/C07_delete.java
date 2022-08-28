package day32_StringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(8, 9);
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

        //bastan baslayarak her loop'da ilk harfi silip kalani yazdiralim

        int son = sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

        }

        StringBuilder sb1 = new StringBuilder("Yicem seni Java");
        System.out.println(sb1);
        int son1 = sb1.length();
        for (int i = 0; i < son1; i++) {
            sb1.deleteCharAt(0);
            System.out.println(sb1);

        }
    }
}
