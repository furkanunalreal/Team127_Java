package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan iki kenar uzunlugu alıp dikdortgenin alanını hesapla

        Scanner scanner = new Scanner(System.in);
        System.out.println("İki adet kenar uzunluğu girmeniz gerekiyor");
        System.out.print("Uzun kenar : ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Kısa kenar : ");
        double kisaKenar = scanner.nextDouble();
        System.out.println("Girdiğiniz uzun kenar : " + uzunKenar + " , " + "Girdiğiniz kısa kenar : " + kisaKenar);
        System.out.println("Dikdörtgenin alanı : " + (uzunKenar * kisaKenar));
    }
}
