package Abstractclass;

abstract class A1 {
    abstract void display();
}

class B1 extends A1 {
    void display() {
        System.out.println(" display B1 abstract ");
    }
}

public class program2 {
    void display() {

        System.out.println("display program2");
    }

    public static void main(String[] args) {

        program2 obj = new program2();
        obj.display();
    }

}
