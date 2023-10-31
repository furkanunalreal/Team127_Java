package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini , soyismini ve yasını alıp aşgıdaki formatta yazdır
        // girilen bilgiler : J Doe , 44

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla isminizi,soyisminizi ve yaşınızı giriniz");
        char ilkHarf = scanner.nextLine().charAt(0); // char data türünde nextChar methodu yoktur
        String soyIsim = scanner.nextLine();
        int yas = scanner.nextInt();
        System.out.println("Girilen bilgiler : " + ilkHarf + " " + soyIsim + ", " + yas);

        // 12. satırda method olarak nextLine kullanmaya gerek yok ama next methodu ve nextLine methodu ard arda gelince sorun olabiliyor



    }
}
