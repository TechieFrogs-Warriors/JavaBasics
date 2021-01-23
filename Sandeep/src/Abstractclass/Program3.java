package Abstractclass;
// final abstract class Squre

// {

// }

abstract class Shape {
    abstract void draw();

    static void color() {
        System.out.println("color");
    }
    // public abstract void line();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    // abstract color();
    void draw() {

        System.out.println("drawing circle");
    }
    // public void line()
    // {
    // System.out.println("line");
    // }

}

public class Program3 {
    public static void main(String[] args) {
        // Shape obj1=new Shape();

        Circle obj = new Circle();
        obj.draw();
        Circle.color();
    }
    public static void main(Integer[] args) {
        // Shape obj1=new Shape();

        Circle obj = new Circle();
        obj.draw();
        Circle.color();
    }

}
