package day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01_ obj=new C01_();
        /*
        class adi: C01
        obj: objenin adi
        new: keyword (obje oluşturmak için mutlaka yazılmalı)
        C01(): constructor(yapıcı)--> bir Classın obje üretmöesi için mutlaka sahip olması gereken bir yapı
        oop konsepti olabilmasi için obje üretmek gerekiyor ve java bu objeyi constructor'lar vasıtasıyla yapıyor
        constructor: javanin obje oluşturmak için kullandıgı bir code bloğudur
         */

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> List=new ArrayList<>();
        List<String> List1=new ArrayList<>();

        /*
        Javada bir obje oluşturabilmek için
        mutlaka constructor kullanmalısınız

         */


        System.out.println(obj.sayi);// 0
        obj.deneme(); //C01 den deneme methodu calisir




    }

}
