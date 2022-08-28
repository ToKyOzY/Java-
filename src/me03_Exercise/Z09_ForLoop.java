package me03_Exercise;

public class Z09_ForLoop {
    public static void main(String[] args) {

        //2 basamklı en büyük sayıdan 0 a kadar 3 e bölünebilen sayıların yan yana yazıldığı
        //bir method oluştur

        int input=99;
        uceBolunen(input);

    }

    public static int uceBolunen(int input) {

        for (int i =input; i >=0 ; i--) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
        return input;
    }
}
