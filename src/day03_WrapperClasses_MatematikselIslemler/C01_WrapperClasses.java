package day03_WrapperClasses_MatematikselIslemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        int sayi = 20;
        String str = "Java";

        // Eğer primitive data türlerini kullanmak istersek ve hazır methodlara da ihtiyacımız varsa wrapper class lar kullanılabilir

        Integer sayi2 = 30;

        sayi = sayi2;
        sayi2 = sayi;

        // primitive data türleri ile o türünn wrapper class ı arasında gecis mümkündür

        char chr1 = 'j';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shr = 3;
        Double dbl = 3.5;
        Float flt = 2.3f;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String str1 = "34";
        String str2 = "45";

        // str1 ve str2 yi matematiksel olarak toplayınız

        System.out.println(str1 + str2); // 3445 metinsel bir ifadedir.

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        // parseInt tamamen sayılardan oluşan bir ifadeyi sayısal bir değere dönüştürür

        str1 = "34a";
        str2 = "23";
        // System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        // str1 değerinde a ifadesi sayısal bir değere çevrilemediğinden hatalı bir kod olur

        chr1 = 'a';
        System.out.println(Character.isDigit(chr1)); // false rakam mı diye sorduk
        System.out.println(Character.isLetter(chr1)); // true harf mi
        System.out.println(Character.toUpperCase(chr1)); // A

        // int olarak verilen bir sayıyı String e nasıl cevirilir
        // String metin = 23; bu kodu bu halde kabul etmez
        String metin = 23 + "a"; // Bir sayının yanına string yazarsak o değeri metinleştirir
        System.out.println(metin);
        metin = 23 + ""; // metinsel ifade
        System.out.println(metin); // 23 metinsel olarak

        // valueOf ile parseInt arasında bir fark yoktur
    }
}
