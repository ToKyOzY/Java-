package lambda_fuctional_praogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {

        Courses courseTurkishDay=new Courses("Summer","Turkish Day",97,128);
        Courses courseTurkishNight=new Courses("Winter","Turkish Night",98,154);
        Courses courseEnglishDay=new Courses("Summer","English Day",95,132);
        Courses courseEnglishNight=new Courses("Winter","English Night",93,144);

        List<Courses> coursesList=new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);


        System.out.println(ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,75));
        System.out.println(herhangibirKursAdiVerilenKelimeyiIceriyorMu(coursesList,"Turkish"));
        ortalamasiEnYuksekKursunAdiniYazdir(coursesList);
        System.out.println(ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,3));

    }

    //1- Tüm ortalama puanların verilen sayıdan buyuk ollup olmadıgını kontrol etmek için bir method olusturalım
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> list, double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);
    }
    //2- Kurs adlarından en az birinin verilen kelimeyi içerip içermedigini kontrol etmek için bir method oluştur

    public static boolean herhangibirKursAdiVerilenKelimeyiIceriyorMu(List<Courses> list, String kelime){
        return list.stream().anyMatch(t-> t.getCourseName().contains(kelime));
    }

    //3- Ortalama puanı en yuksek olan kursu yazdırmak için bir yontem olusturun
    public static void ortalamasiEnYuksekKursunAdiniYazdir(List<Courses> list){
       String  sonuc= list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(sonuc);
    }

    //4- List ogelerini artan duzende ortalama puana gore sıralayın ve ilk verilenleri atlayın

    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list, int x){
       return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
    }
}
