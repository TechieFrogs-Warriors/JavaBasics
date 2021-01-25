package Interfaceprograms;

interface A {
    // int x;//the filed should be intilized
    
    int a = 10;
    public int b = 20;
    static int c = 30;
    final int d = 40;
    public static final int g = 70;

    // private int e=50;//private varibles cannot be intilized
    // protected int f=60;//protected varibles cannot be intilized
    void print();

    static void display() {
        System.out.println("Static method in interface");
    }
}

interface B {
    interface C {
        void printc();
    }

    class Exp {

    }

    int a = 100;

    void print();
}

public class Example4 implements A, B, B.C {

    public void print() {
        System.out.println("print");

    }

    public void printc() {
        System.out.println("C interface method");
    }
    // public void print()// only one method is implemnted if the two interface are
    // having same methods
    // {

    // }
    public static void main(String[] args) {
        // a=20;//once value assigined cannot be changed
        A obj = new Example4();
        obj.print();
        System.out.println("a: " + A.a + " " + B.a + "b: " + b + "c: " + c + "d: " + d + "g: " + g);
        // if 2 interfaces are having the same variable declared this call we used by
        // interface name
        A.display();
        B obj1 = new Example4();
        ((C) obj1).printc();

    }
}
