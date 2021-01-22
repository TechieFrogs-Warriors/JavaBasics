package Abstractclass;

abstract class Shape2 {
    protected String color = "red";
    protected boolean filled = true;

    public Shape2() {
        this.color = "red";
        this.filled = true;
    }

    public Shape2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape [ color = " + color + " filled = " + filled + " ]";
    }
}

class Circle2 extends Shape2 {
    protected double radius = 1.0;

    public Circle2() {
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * radius;
    }

    public String toString() {
        return "Shape[Circle [ color = " + color + " filled = " + filled + " ]  radius = " + radius + " ]";
    }
}

class Rectangle2 extends Shape2 {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle2() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle2(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "shape[Rectangle [ color = " + color + " filled = " + filled + " ]  length = " + length + " width = "
                + width + " ]";
    }
}

class Square2 extends Rectangle2 {
    double side = 2.0;

    public Square2() {
        this.side = 2.0;
    }

    public Square2(double side) {
        this.side = side;
    }

    public Square2(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Shape[Square [ color = " + color + " filled = " + filled + " ]  length = " + length + " width = "
                + width + " ]";
    }

}

public class Excercises8 {
    public static void main(String[] args) {

        Circle2 obj = new Circle2();
        System.out.println("Area of Circle : " + obj.getArea() + "\nperemeter of circle : " + obj.getPerimeter());

        Circle2 obj1 = new Circle2(3.0);
        System.out.println("\n\nArea of Circle : " + obj1.getArea() + "\nperemeter of circle : " + obj1.getPerimeter());

        Circle2 obj2 = new Circle2(2, "yellow", false);
        System.out.println("\n\nArea of Circle : " + obj2.getArea() + "\nperemeter of circle : " + obj2.getPerimeter()
                + "\ncolor : " + obj2.getColor() + "\nfilled : " + obj2.isFilled());

        Rectangle2 ret = new Rectangle2();
        System.out.println("Area of Rectangle : " + ret.getArea() + "\nPerimeter of rectangle : " + ret.getPerimeter());

        Rectangle2 ret1 = new Rectangle2(4.5, 2.25);
        System.out.println(
                "\n\nArea of Rectangle : " + ret1.getArea() + "\nPerimeter of rectangle : " + ret1.getPerimeter());

        Rectangle2 ret2 = new Rectangle2(4.5, 2.25, "blue", true);
        System.out.println("Area of Rectangle : " + ret2.getArea() + "\nPerimeter of rectangle : " + ret2.getPerimeter()
                + "\ncolor : " + ret2.getColor() + "\nfilled : " + ret2.isFilled());

    }

}
