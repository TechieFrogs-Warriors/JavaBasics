
public class Staticmethod {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static int myMethod(int a) {
        return a;
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod1(int x, int y) {
        return 5 + x + y;
        // return 8 + y;
    }

    static int myMethod(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {

        myMethod();
        myMethod(4);
        myMethod(5);

        myMethod("Liam");
        myMethod("Jenny");

        myMethod("Liam", 5);
        myMethod("Jenny", 8);

        System.out.println(myMethod1(3, 5));

        int i = myMethod(5, 3, 10);
        System.out.println(i);

    }

}
