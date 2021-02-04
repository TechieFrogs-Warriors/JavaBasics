package Abstractclass;

abstract class A1 {
    abstract void display();
    // abstract void cat();

    public A1() {
        System.out.println("empty A1");
    }

    public A1(int i) {
        System.out.println("i A1");
    }

    public void print() {
        System.out.println(" print ");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("Empty B1");
    }

    public B1(int i) {
        System.out.println("i B1");
    }

    static void method() {
        System.out.println("Static method");
    }

    void display() {
        System.out.println(" display B1 abstract ");
    }
}

public class program2 extends B1 {
    public program2(int i) {
        System.out.println("i Program2");
    }

    void display() {

        System.out.println("display program2");
    }

    public static void main(String[] args) {

        program2 obj = new program2(10);
        obj.display();
        obj.print();
        B1.method();
    }

}
