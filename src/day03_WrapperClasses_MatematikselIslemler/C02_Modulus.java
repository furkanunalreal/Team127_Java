package day03_WrapperClasses_MatematikselIslemler;

public class C02_Modulus {
    public static void main(String[] args) {

        System.out.println(85 % 6); // 1
        System.out.println(283 % 10); // birler basamağı için modulus 10 kullanıyoruz
        System.out.println(283 % 2); // 283 tek mi çift mi ? 1 ise tek sayıdır
        System.out.println(347 % 5); // 347 sayısı 5 ile tam bölünür mu ? 0 değilse tam bölünmez

        System.out.println(85/6); // iki sayı da integer sa virgüllü kısmı görmez
        System.out.println(85/6.5); // 13.076
        System.out.println(2 / 10); // 0


    }
}
