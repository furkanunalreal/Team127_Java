package day03_WrapperClasses_MatematikselIslemler;

public class C05_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi --;
        System.out.println(sayi); // 9

        int sayi1 = 10;
        sayi1 ++;
        System.out.println(sayi1); // 11

        int a = 20;
        // a nın değerini yazdırın
        // sonra a nın değerini 1 artırıp ve oluşturduğumuz b variable ına yeni değeri atayın

        System.out.println("a'nın değeri : " + a);
        a += 1;
        int b = a;
        System.out.println("b'nin değeri : " + b);

        a = 20;
        // a nın değerini b ye atayın
        // sonra a'nın değerini 1 artırın

        b = a;
        a += 1;
        System.out.println("a'nın değeri : " + a);

        System.out.println("========================");

        // bu işlem sadece ++ veya -- şeklinde ki kullanım içindir

        a = 20;
        b = a++;
        System.out.println("a++ işlem sonrasındaki a değeri : " + a + " , " + "b değeri : " + b);
        // ++ a dan sonra olduğu için önce a değerini b ye atanır daha sonra a artırılır

        a = 20;
        b = ++a;
        System.out.println("++a işlem sonrasındaki a değeri : " + a + " , " + "b değeri : " + b);
        // ++ a dan önce olduğu için önce a artırılır daha sonra a nın değeri b ye atanır

        int c = 40;
        System.out.println("c++ ile yazdırınca : " + c++); // önce c yi yazdırdı sonra c ye 1 ekledi
        System.out.println("c++ ile bir alt satırda c'nin değeri : " + c);

        System.out.println("--------------------------------------");

        c = 40;
        System.out.println("++c ile yazdırınca : " + ++c); // önce 1 ekleyip c yi yazdırdı
        System.out.println("++c ile bir alt satırda c'nin değeri : " + c);

        System.out.println("--------------------------------------");

        a = 20;
        b = 30;
        c = 40;
        c = b++ + a; // önce b ile a toplanır ve c ye atanır sonra b 1 artırılır
        System.out.println("a'nın değeri : " + a + " , " + "b'nin değeri : " + b + " , " + "c'nin değeri : " + c);
    }
}
