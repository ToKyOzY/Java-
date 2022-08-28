package dayy01_practice01;

public class Q11_IfStatements {
    public static void main(String[] args) {
        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */

        int note=85;

        if (note>=90 && note<=100){
            System.out.println("A");

        } else if (note < 90 && note >=80) {
            System.out.println("B");
        } else if (note<70  && note>=60) {
            System.out.println("D");

        }else {
            System.out.println("F");
        }
    }
}
