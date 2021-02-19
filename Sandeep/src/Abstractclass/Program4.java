package Abstractclass;

abstract class Demo {
    abstract void print();
    //static abstract void display();
}

public abstract class Program4 extends Demo {
    void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {
        Program4 obj = new Program4() {

        };
        obj.print();
    }

}
