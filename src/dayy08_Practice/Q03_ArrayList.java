package dayy08_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr={2,3,6,34,67,67,850,459,56};
        int n=4;

        //bir liste olusturalim

        List<Integer> list=new ArrayList<>();
        //listeye elemanlari ekleyelim
        for (int each:arr
             ) {
            list.add(each);
        }
        List<Integer> maxList=new ArrayList<>();

        int count=1;
        while (count<=n){
            int max=list.get(0); //listin ilk elemani max olsun
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){ //listin herhangi elemani max'dan buyukse
                    max=list.get(i);
                }

            }
            maxList.add(max);
            list.remove(list.indexOf(max)); //maxlist' ekledigim ayni sayiyi artik kaldiriyorum
            count++;
        }
        System.out.println("Arrayin max "+n+" elemani "+maxList);

    }
}
