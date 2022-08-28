package day24_ArrayLists_ForEachLoop;

public class C07_ForEachLoop {
    public static void main(String[] args) {
        /*

         */
        int[] sayilar={1,2,4,7,5,9,7};
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each*each;
        }
        System.out.println(toplam);
    }
}
