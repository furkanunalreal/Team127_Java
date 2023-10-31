package day03_WrapperClasses_MatematikselIslemler;

public class C04_IncrementDecrement {
    public static void main(String[] args) {
        int sayi = 20;
        sayi = sayi + 5;
        System.out.println(sayi);

        // sayiyi 3 artırıp yazdırın
        System.out.println(sayi += 3); // 28

        // sayinin değerini 2 katına cıkarıp yazdırın
        System.out.println(sayi *= 2); // 56
    }
}
