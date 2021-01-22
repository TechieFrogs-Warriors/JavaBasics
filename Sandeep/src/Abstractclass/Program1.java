package Abstractclass;

abstract class CarA {
    abstract void run();

    // private abstract void color();
    // protected abstract void seater();
    // static abstract void model();
    // final abstract void varient();

    public void type() {
        System.out.println("type of car");
    }
    // Constructor
    // abstract CarA()
    // {

    // }
    protected CarA() {
        System.out.println("Empty CarA");
    }

    public CarA(int i) {
        System.out.println("i CarA");
    }
}

class Bmw extends CarA {
    void run() {
        System.out.println("running");
    }

    void color() {
        System.out.println("color");
    }
    // void model()
    // {

    // }

    // void seater() {
    // System.out.println("type of seater");
    // }

    // constructor
    public Bmw() {
        System.out.println("Empty. Bmw");
    }

    public Bmw(int i) {
        super(20);
        System.out.println("i Bmw");
    }
}

public class Program1 {
    public static void main(String[] args) {
        Bmw obj = new Bmw();
        obj.run();
        obj.type();

        Bmw obj1 = new Bmw(20);
        obj1.color();
    }

}
