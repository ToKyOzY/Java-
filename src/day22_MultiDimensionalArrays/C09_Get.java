package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_Get {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);


        List<String > isimler=new ArrayList<>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");


        isimler.get(2); //Enes
        System.out.println(isimler.get(2)); //Enes
        System.out.println(sayilar1.get(1)); //3



    }
}
