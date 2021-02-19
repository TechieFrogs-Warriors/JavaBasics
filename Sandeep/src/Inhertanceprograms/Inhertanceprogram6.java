package Inhertanceprograms;

class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle1 extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is Circle");
    }
}

class Squre1 extends Rectangle1 {
    public void printSquare() {
        System.out.println("Square is a Rectangle");
    }
}

public class Inhertanceprogram6 {
    public static void main(String[] args) {
        Squre1 obj = new Squre1();
        obj.printShape();
        obj.printRectangle();

    }

}
