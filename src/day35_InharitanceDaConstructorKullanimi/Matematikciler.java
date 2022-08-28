package day35_InharitanceDaConstructorKullanimi;

public class Matematikciler {
    Matematikciler(){
        System.out.println("Matemeatik parametresiz cons");
    }
    Matematikciler(String isim){
        this();//super'in yerine bisey yazıldıgı icin
        //super oldu..this-->bu class'daki parametresiz cons goturur
        System.out.println("Matematik parametreli cons");
    }

    public static void main(String[] args) {

        Matematikciler obj1=new Matematikciler("Tugba");
    }

    /*
    this() cons call icinde bulunan constructurlaari
    super() ise parent class'da bulunan cons lari cagirir

    this() veya super() parametre yapisina uygun bir cons
    bulamazsa Java CTE verir

    cons konusunda gördugumuz this.
    o class'daki instance variable'lari refere ediyordu

    inheritance'da da super. vardir
    super. parent class'daki instance'lari refere eder
     */

}
