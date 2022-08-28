package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb);

        //Append istedigimiz String'i en sona ekler

        sb.insert(4," her seyi dusunmus");
        System.out.println(sb);

        //araya ekleme yapmak istedigimizde append yerine insert kullaniriz





    }
}
