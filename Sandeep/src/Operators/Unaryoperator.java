package Operators;

public class Unaryoperator {
    public static void main(String args[]) throws Exception {
        System.out.println("--------Unary Operator----------");
        int a = 20;
        int b = 30;
        boolean c = false;
        boolean d = true;

        System.out.println("Print a:" + a++);
        System.out.println("Print a:" + (++a));
        System.out.println("Print a:" + a--);
        System.out.println("Print a:" + (--a));

        System.out.println("addition a:" + (a++ + ++a));
        System.out.println("addition b:" + (b++ + b++));
        int i = (((a++) + (++a)) + ((b++) + (++b)));
        System.out.println("Print i:" + i);

        int e = -40;
        int f = 50;
        byte z = 00011;

        System.out.println(~e);
        System.out.println(~f);
        System.out.println(~z);
        System.out.println(!c);
        System.out.println(!d);

    }

}
