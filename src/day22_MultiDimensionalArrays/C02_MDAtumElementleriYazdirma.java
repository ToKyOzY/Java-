package day22_MultiDimensionalArrays;

public class C02_MDAtumElementleriYazdirma {
    public static void main(String[] args) {
        /*
        verilen bir multi dimensional array'in tüm elementlerini yazdiran
        bir method oluşturun

         */

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementleriYAzdir(sayilar);
    }

    public static void elementleriYAzdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { //i=0,1,2 degerleri alacak
            for (int j = 0; j <sayilar[i].length ; j++) {// inner array'in uzunluguna bagladık
                System.out.println(sayilar[i][j]+" ");

            }

        }
    }
}
