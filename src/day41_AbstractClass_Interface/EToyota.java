package day41_AbstractClass_Interface;

public abstract class EToyota extends DAraba{
    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class'ddki standart belirleyici yani abstract method'lar
    child tarafindan override edilmelidir.

    concrete method'larin override mecburiyeti yoktur
    istersek override edebiliriz istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretebilecegimiz bir class degil
    bu durumda eger proje tasrimi yapiyorsaniz
    toyota class'ini da abstract yapsaniz guzel olur.
     */
}
