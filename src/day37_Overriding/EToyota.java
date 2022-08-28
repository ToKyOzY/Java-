package day37_Overriding;

public class EToyota extends DAraba{


    void marka(){
        System.out.println("Markamiz Toyota'dir");

    }

    @Override
    void motor() {
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
