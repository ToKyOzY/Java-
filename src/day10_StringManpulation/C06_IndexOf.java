package day10_StringManpulation;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok kolay";

        System.out.println(str.indexOf("o")); //5
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("t")); //bana integer donduruyor
                                              // int'de yok diye bir deger bulunmuyor
                                              //0 dersek J'nin index'idir
                                              //- bir deger donerde biz aranan string'in str da olmadigini
                                               //java -1 döndürmeyi tercih etmiştir

        String  str5="wnnkjneohjnowkmfaknffwnnafahnwnfşaknwı";

        //str5'de p harfi var mıdır?
        if (str5.indexOf("p")==-1){
            System.out.println("str5'de istenen karakter kullanılmamış");
        }else {
            System.out.println("str5'de istenen karakter kullanilmis");
        }

    }
}
