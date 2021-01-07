abstract class Anonymous {
    abstract void print();
}

class Outer2 {
    static class Nested {
        void Large() {
            int a = 10;
            int b = 20;
            if (a > b) {
                System.out.println("a is greater than b");
            } else if (b > a) {
                System.out.println("b is greater than a");
            } else {
                System.out.println("a and b are equal");
            }
        }
    }

    class Inner1 {
        void EvenOdd() {
            int a = 10;
            if ((a % 2) == 0) {
                System.out.println(a + " Is a  Even");
            } else {
                System.out.println(a + " Is a Odd");
            }
        }
    }
}

public class NestedInner {
    public static void main(String[] args) {

        // instanting nested class object
        Outer2.Nested nested = new Outer2.Nested();
        nested.Large();

        // instanting inner class object
        Outer2 outer = new Outer2();
        Outer2.Inner1 inner = outer.new Inner1();
        inner.EvenOdd();

        // instanting Anonymous class class
        Anonymous obj = new Anonymous() {
            void print() {
                int i = 10;
                int j = 20;
                int k = i + j;
                System.out.println(k);
            }
        };
        obj.print();

    }
}
