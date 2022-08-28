package dayy07_practise;

public class Q01_MDArray {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] arr={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("arr {"+i+"}");;

        }
    }
}
