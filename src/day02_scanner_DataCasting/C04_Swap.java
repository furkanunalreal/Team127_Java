package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {
        // kullanıcıdan ikideğer alıp değerlerini değiştirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki tam sayı giriniz");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = 0;
        z = x;
        x = y;
        y = z;
        System.out.println("x'in değeri : " + x + " , " + "y'in değeri : " + y);


    }
}
