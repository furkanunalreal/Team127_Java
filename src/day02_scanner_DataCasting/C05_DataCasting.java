package day02_scanner_DataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {
        // data casting : bir data türündeki variable a başka data türünden değer atamaya denir
        // ancak her data türü birbirine cevrilemez

        int sayiInt = 34;
        String str = "Java candir";
        boolean bl = true;
        char chr = '%';
        double dbl = 4.5;
        byte byt = 10;
        short shrt = 23;

        // byte-short-int-long-float-double küçükten büyüğe

        dbl = sayiInt;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        // boolean data türündeki bir variable a sadece boolean değerler atayabilirsiniz

        shrt = byt; // byte data türündeki bir değişken olan byt otomatik olarak shrt data türüne dönüşür

        // Javanın otomatik olarak kabul ettiği bu dönüşümlere auto-widening denir
    }
}
