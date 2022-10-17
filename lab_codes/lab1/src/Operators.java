public class Operators {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int g = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a-- = " + (a--));

        // Check the difference in d++ and ++d
        System.out.println("d++   = " + (g++));
        System.out.println("d++   = " + (g));
        System.out.println("++d   = " + (++g));

        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        a = 60;	/* 60 = 0011 1100 */
        b = 13;	/* 13 = 0000 1101 */
        c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;           /*-61 = 1100 0011 */
        System.out.println("~a = " + c );
        /* 60 = 0011 1100 */
        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

        boolean d = true;
        boolean e = false;

        System.out.println("d && e = " + (d&&e));
        System.out.println("d || e = " + (d||e) );
        System.out.println("!(d && e) = " + !(d && e));


    }
}
