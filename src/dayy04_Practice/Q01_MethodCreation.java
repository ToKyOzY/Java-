package dayy04_Practice;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran
     parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */
        birKereYazdir("aabbcccccddddaa");


    }

    private static void birKereYazdir(String str) {
        String output=""; //String default degeri string oldugu icin isleme etki etmesin diye boyle atama yaptik

        for (int i = 0; i <str.length() ; i++) { // for (int i = 0; i <=str.length()-1 ; i++) { bu sekilde de olur
            if (output.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz icin sonucumuz str'dan aldigimiz herhangi bir karakter icermesin
                output+=str.substring(i,i+1); // o zaman sonuca eklesin
            }

        }
        System.out.println(output);


    }
}
