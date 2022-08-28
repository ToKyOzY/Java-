package day22_MultiDimensionalArrays;

public class C03_MDAistenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen 2 katli bir multi dimensional array'de
        outer index'i ve inner index'i aynı olan
        sayilarin toplamini bulunuz
        örn:
         int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
         [0][0]+[1][1]+[2][2].....

         */
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        int istenenTop=0;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (i==j){
                    istenenTop+=sayilar[i][j];
                }

            }

        }
        System.out.println("istenen toplam : " +istenenTop);

    }
}
