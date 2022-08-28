package lambda_fuctional_praogramming;

public class Utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj){
        System.out.print(obj+" ");
    }

    public static boolean ciftElemanlariSec(int x){
        return x%2==0;

    }

    public static boolean tekElemanlariSec(int x){
        return x%2!=0;
    }

    public static int karesiniAl(int x){
        return x*x;
    }

    public static int kupunuAl(int x){
        return x*x*x;
    }

    public static double yarisiniAl(double x){
        return x/2;
    }

    public static char sonKarakteriAl(String str){
        return str.charAt(str.length() - 1);
    }
    public static char ilkKarakteriAl(String str){
        return str.charAt(0);
    }

    public static int rakamlarToplami(int x){

        int toplam=0;

        while (x>0){
            toplam+=x%10;
            x=x/10;
        }
        return toplam;

    }
}

