package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen orr1=new Ogretmen();

        orr1.setIsim("Tulay");
        System.out.println(orr1.getIsim());

        /*
        bu yontemde data hiding degil
        daha anlasilir bir code amaclanmis olur
         */

    }
}
