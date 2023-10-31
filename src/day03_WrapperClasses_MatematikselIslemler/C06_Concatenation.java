package day03_WrapperClasses_MatematikselIslemler;

public class C06_Concatenation {
    public static void main(String[] args) {

        // Concatenation (String Birleştirme)
        // Bir stringi başka bir string veya primitive deger ile + işareti kullanarak işleme sokarsak
        // java bu değişkenleri birleşterirrek yeni bir String oluşturur

        String a = "Hello";
        int b = 2;
        int c = 3;
        System.out.println(a+b+c); // Hello23
        System.out.println(c+b+a); // 5Hello
        System.out.println(a+(b+c)); // Hello5
        System.out.println(a+b*c); // Hello6

        String s1 = "Java";
        String s2 = "Kolaydir";
        String s3 = " ";
        String s4 = "";

        int x = 4;
        int y = 3;

        // sadece verilen variableları kullanarak asagıda istenen metinleri yazınız

        // Java Kolaydır 12
        System.out.println(s1+s3+s2+s3+x*y);

        // Java7Kolaydır
        System.out.println(s1+(x+y)+s2); // x+y yi parentize almasaydık Java43Kolaydır olurdu

        // 43Java
        System.out.println(s4+x+y+s1);
        System.out.println(x+(y+s1));






    }
}
