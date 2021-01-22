package Abstractclass;

abstract class Abst {
    public Abst() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void b_method() {
        System.out.println("This is normal method of abstract class ");
    }
}

public class Excercises5 extends Abst {
    public void a_method() {
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        Excercises5 obj = new Excercises5();
        obj.a_method();
        obj.b_method();
    }
}
