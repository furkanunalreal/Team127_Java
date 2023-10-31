package day03_WrapperClasses_MatematikselIslemler;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanıcıdan 3 basamaklı pozitif bir tamsayı alıp
        // sayinin rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Lütfen üç basamaklı bir pozitif sayı giriniz --");
        int girilenSayi = scanner.nextInt();
        System.out.println("Girdiğiniz üç basamaklı pozitif sayı : " + girilenSayi);

        int rakamlarToplami = 0;
        int rakam = 0;

        rakam = girilenSayi % 10; // birler basamagı için
        rakamlarToplami = rakamlarToplami + rakam;

        girilenSayi = girilenSayi / 10; // sayıyı birler basamagından kurtarıyoruz
        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        girilenSayi = girilenSayi / 10;
        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        System.out.println("Girilen sayının rakamlar toplamı : " + rakamlarToplami);

        // Modulus işlemi bira bölme işlemaiandeki kalan sayıyı bize verir






    }
}
