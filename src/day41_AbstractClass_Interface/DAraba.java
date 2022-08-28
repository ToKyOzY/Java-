package day41_AbstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class'lar main method opsiyonel'dir(olmak zorunlulugu yok ama olabilir)
        Eger abstract class sadece child class'larin tasimak zorunda oldugu
        ozellikleri belirlemek icin olusturulduysa main method'a ihtiyac duymaz
        sadece aabstract method'lar olur

        ama bir abstract method'da
        standart belirlemek disinda da method'lar calisabilir
        bu durumda ihtiyac olursa main method olusturulabilir



         */
    }
    public abstract void motor();
    /*
    sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract method'larin body'si olmaz
     */
    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract(soyut demek) olmayan method'lara concrete method denir
        abstract bir method'u abstract keyword ile belirtmek zorunludur
        ancak concrete method'larda bunun declare edilmesine gerek yoktur

        biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz.
         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();


}
