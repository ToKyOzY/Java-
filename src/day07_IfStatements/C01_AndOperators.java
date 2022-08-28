package day07_IfStatements;

public class C01_AndOperators {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b>20 && c>=b); // false

        /*
        java & operatoru bize iki seçenek sunar
        
        && kullanırsak ilk false buldugunda artık sonucun false olacagını bilir
        bilir ve gerşye kalan sartları incelemez.
        
        & kullanırsak tum sartları kontrol eder sonra sonucu belirler.
        bir calışma usulunden dolayı & oparetoru , && operatorune gore daha yavas
        olabilir.
         */

        System.out.println(a<0 & b<20 & c>=b); // false


    }
}
