package Practice;

import java.util.*;

class AA {
    private static int a = 20;

    static class A1 {
        void display() {
            System.out.println(a);
            System.out.println("This is nested class");
            class A3 {
                void print() {
                    System.out.println("A3");
                }
            }
            A3 obj4 = new A3();
            obj4.print();

        }

    }

    class A2 {
        void dispay() {
            System.out.println("This is inner class");
        }
    }
}

public class program55 {
    public static void main(String[] args) throws Exception {
        AA.A1 obj = new AA.A1();
        obj.display();
        AA obj1 = new AA();
        AA.A2 obj2 = obj1.new A2();
        obj2.dispay();
    }

}
