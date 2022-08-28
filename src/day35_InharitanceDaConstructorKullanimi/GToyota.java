package day35_InharitanceDaConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("GToyota parametresiz cons");
    }
    GToyota(String isim){
        //super(isim); extends olmadigi icin Java super cons call'u kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}
