package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {
    public static void main(String[] args) {
        int sayi = 20;
        // byte byt = sayi; bu kod otomatik olarak çalışmaz ama buna elle müdahale edebiliriz
        // burda değer kaybı olması muhtemeldir
        byte byt = (byte) sayi;
        System.out.println("20 değerinin byte olarak karşılığı : " + byt); // 20

        sayi = 130;
        byt = (byte) sayi;
        System.out.println("130 değerinin byte olarak karşılığı : " + byt); // -126
        // -126 olma sebebi : byte -128 den +127 ye kadar değer alabilir. +127 den sonra 3 kalıyor ve -126 ye geliyor

        double dbl = 34.7;
        sayi = (int) dbl;
        System.out.println("34.7 in int türünde değeri : " + sayi); // 34
        // double dan casting yaptığımızda virgülden sonraki kısmı atar

        // non-primitive data türlerinde de olur. parent-child class lar arasında geçerlidir

    }
}
