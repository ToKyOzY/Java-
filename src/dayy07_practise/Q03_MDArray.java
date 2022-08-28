package dayy07_practise;

public class

Q03_MDArray {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        
        int[][] arr={{1,3,6},{2,8},{5,7,9,14}};
        
        ciftleriTopla(arr);
        
    }

    private static int ciftleriTopla(int[][] arr) {
        int top=0;
            for (int[] each1 : arr){
                for (int each2 :each1){//-->each1'in herbir elemanından al
                    if (each2%2==0){
                        top+=each2;
                    }

            }

        }
        System.out.println("Array'deki çift sayıların toplamı = " + top);
            return top;
    }
}
