package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan uç farklı değer alıp girilen degerleri acıklamalarıyla yazdırın

        Scanner scanner = new Scanner(System.in); // scanner objesi
        System.out.print("Lütfen isminizi giriniz : ");
        String girilenIsim = scanner.next(); // next method u sadece satırdaki ilk kelimeyi alır
        System.out.println("Girilen İsim : " + girilenIsim);

        // nextLine methodu tüm satırı alır

        System.out.print("Lütfen yaşınzı giriniz : ");
        int girilenYas = scanner.nextInt();
        System.out.println("Girilen yaş : " + girilenYas);
        // class içinde bir scanner sınıfı varsa ikincisinin kullanımına gerek yoktur

        System.out.print("Emekli misiniz ? - true yada false olarak giriniz : ");
        boolean emekliMi = scanner.nextBoolean();
        System.out.println("Emekli misiniz ? : " + emekliMi);

    }
}
