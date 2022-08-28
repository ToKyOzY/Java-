package day42_AbstractClass_Interface;

public class C01_AbstractClassOzet {
    /*
    1-bir classi abstract yapip yapmamaya bastan karar veririz
    eger bir class'dan obje olusturmayacaksak, o class'i child class'larinin
    uymasi gereken kurallai belirleyecek sekilde
    dizayn etmek istiyorsak abstract class yapariz
    2- Abstract bir class'da child class'larin mutlaka uymasi gereken kurallari abstract method'lar
    ile belirleriz. Abstract method'lar mutlaka child class'da override edilecegi icin body'ye ihtiyac duymaz
    3-Abstract olarak tanimlanan method'larin body'si olmaz
    4-Abstract class zincirinden sonra gelen ilk concrete class, parent'larinda bulunan ve concrete
    olmayan tum method'lari override etmek ZORUNDADİR.. Ancak parent abstract class'larda bulunan
    concrete method'lari override etmek zorunda degildir.
    5-Abstract method'lar private,final veya sttatic olarak tanimlanamaz
    6-Concrete bir class'in icerisinde abstract methodlar OLAMAZ.
    7-Abstract bir class'in abstract child'i parent'daki abstract method'lari override etmek zorunda degil,
    8-Abstract class'lar constructor'a sahiptir fakat abstract class'lardan onje olusturulamaz..

     */
}
