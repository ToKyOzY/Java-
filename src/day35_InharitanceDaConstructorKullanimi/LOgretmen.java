package day35_InharitanceDaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen marametresiz cons");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli cons");
    }
}



