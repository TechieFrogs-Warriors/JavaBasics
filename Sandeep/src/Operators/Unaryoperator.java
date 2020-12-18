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

        System.out.println("addition:" + a++ + ++a);
        System.out.println("addition:" + b++ + b++);

        int e = -40;
        int f = 50;
        System.out.println(~e);
        System.out.println(~f);
        System.out.println(!c);
        System.out.println(!d);

    }

}
