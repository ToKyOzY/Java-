package dayy07_practise;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String [][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //parantez içindeki replaceAll methodu ile $ işaretlerinden kurtulduk
                    //sonra elimizde String "12" var (data type String)
                    //double toplam variable ile işleme katmak için data casting yapmak gerekir bu yüzden Double.parseDouble() methodunu kullandık
                    //bu aşamada 12 değeri -> data type: Double oldu, eklerken de 3.2 ile çarpmamızı istediği için çarptık

                }else {
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }
            }

        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("toplam :"+toplam);
    }
}
