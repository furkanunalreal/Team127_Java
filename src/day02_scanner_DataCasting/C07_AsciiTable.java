package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_AsciiTable {
    public static void main(String[] args) {
        char chr1 = 'a';
        char chr2 = 'b';
        System.out.println(chr1+chr2); // 97 + 98 = 195
        // ascii tablosunda ki a ve b değerleri toplar

        int sayi1 = chr1;
        System.out.println("char a nın int karşılığı : " + sayi1);

        // kullanıcıdan bir char alıp
        // ascii table da o karekterden sonra gelen 3 karekteri yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir karekter giriniz : ");
        char krk = scanner.next().charAt(0);
        System.out.println("girilen karekterden 1 sonraki karekter : " + (krk+1));
        System.out.println("girilen karekterden 2 sonraki karekter : " + (krk+2));
        System.out.println("girilen karekterden 3 sonraki karekter : " + (krk+3));

        // eğer char data türündeki bir değeri matematiksel işleme sokarsanız veya sayısal bir data türüne
        // atama yaparsanız ascii table daki degeri ile işleme girer
        // bu yüzden krk+1 , krk+2 ve krk+3 işlemlerinin önüne parantez içinde char yazarsak bize karekter olarak sonuç verir
    }
}