package day01_javaGiris;

public class C03_VariableOlusturma {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(sayi); // 20

        System.out.println("sayi"); // sayi

        int sayi2; // declaration
        sayi2 = 30; // assigment
        System.out.println(sayi2); // 30

        // sayi2 variable 30 ise değerdir

        int a = 10;
        a = a + 20;
        a = 2 * a + 1;
        System.out.println(a); // 61

        // javada eşitliğin solunda sadece variable olur
        // javada ilk önce eşitliğin sağını hesaplar ve soldaki variable atar
        // declaration sadece bir kere yapılabilir ama atama birçok kez yapılabilir

        int not1,not2,ortNot;
        not1 = 80;
        not2 = 90;
        ortNot = (not1 + not2);
        System.out.println(ortNot); // 170

        int not3=80,not4=90,ortNot2 = (not3 + not4)/2;
        System.out.println(ortNot2); // 85

        float sayiFl = 3.4F; // float data türünde değerin sonuna f harfi koymak zorundayız

    }
}
