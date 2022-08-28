package day11_StringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok kolay";
        // verilen bir String'de herhangi bir String veya Char'ın
        //ilk kullanildiği index'i verir

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1

        System.out.println(str.indexOf("mek")); // block olarak düşünür ilk harfin idex'ini verir 10


        // eger istedigimiz index'en sonrasini kotrol etmek isterek o zman
        //ayni method'un

        System.out.println(str.indexOf("g",(6+1)) ); //yazilan index'ten baslar

        //yukaridaki str'da 2. ve 3. e'nin index'lerini bulun

        //2. e'yi bulaabilmek icin 1. e'nin index'inie ihtiyacim var.

        int ilke= str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //eger 2. e varsa 3. e'nin olup olmadigini
        // ve varsa index'ni yazdiralim

        if (ikincie==-1) {
            System.out.println("verilen str'da 2. e yok");


        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");

            }else{
                System.out.println("verilen str'daki 3. e'nin index'i: " + ucuncue);

            }
        }


    }
}
