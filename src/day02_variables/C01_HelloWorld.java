package day02_variables;

public class C01_HelloWorld {
    public static void main(String[] args) {
        int              not                =                60                ;
        //dataturu    variable ismi    assignment sign   variable değeri   işlem bittti
        int not2 = 70;
        //variable      değer
        //java önce değerihesaplar sonra asSign yapar
        not2 = 90;

        //yeni bir int variable oluştur değeri ilk iki variable in ort. olsun
        int ort = (not + not2) / 2;
        System.out.println(ort);


    }
}
