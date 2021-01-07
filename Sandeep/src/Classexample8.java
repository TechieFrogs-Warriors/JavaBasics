class A {
    public static void print() {
        String s = "parent";
        System.out.println(s);

    }
}

class B extends A {
    public static void print() {
        String s = "child";
        System.out.println(s);

    }
}

public class Classexample8 {
    public static void main(String[] args) {

        B.print();
        B.print();
        // method override it prints the subclass method

        A obj = new B();
        obj.print();
    }

}
