package Inhertanceprograms;

class Rectangle2 {
    float length;
    float breath;

    Rectangle2() {

    }

    public Rectangle2(float length, float breath) {
        this.length = length;
        this.breath = breath;
    }

    public void Area() {
        float Area = length * breath;
        System.out.println("Area Of The Rectangle: " + Area);
    }

    public void Perimeter() {
        float Perimeter = (length + breath) * 2;
        System.out.println("Perimeter Of The Rectangle: " + Perimeter);
    }

}

class Square2 extends Rectangle2 {
    float Side;

    public Square2(float side) {
        super(5.3f, 5.4f);
        this.Side = side;
    }

    public void Area() {
        super.Area();
        float Area = Side * Side;
        System.out.println("Area Of The Square: " + Area);
    }

    public void Perimeter() {
        super.Perimeter();
        float Perimeter = 4 * Side;
        System.out.println("Perimeter Of The Square: " + Perimeter);
    }

}

public class Inhertanceprogram4 {
    public static void main(String[] args) {
        Square2 obj = new Square2(6.2f);
        obj.Area();
        obj.Perimeter();

    }

}
