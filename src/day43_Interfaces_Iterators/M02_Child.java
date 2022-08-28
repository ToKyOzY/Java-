package day43_Interfaces_Iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface'de abstract olan 3 method'u implement
    ettigimizde Java itirazi durdurur
    sonradan ekledigimiz
    default veya static keyword ile tanimladigimiz
    method'lari implement etmemiz sorun olusturmadi
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();
        M02_Child obj=new M02_Child();
        obj.teker();
    }
}
