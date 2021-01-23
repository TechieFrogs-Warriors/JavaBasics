package Abstractclass;

abstract class Shape1 {
    abstract double rectangleArea(double length, double breadth);

    abstract double circleArea(double radius);

    abstract double squareArea(double side);
}

class Area extends Shape1 {
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double circleArea(double radius) {
        return radius * radius * Math.PI;
    }

    double squareArea(double side) {
        return side * side;
    }
}

public class Excercises7 {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of rectangle : " + obj.rectangleArea(4.25, 5.98));
        System.out.println("Area of square : " + obj.squareArea(5.87));
        System.out.println("Area of circle : " + obj.circleArea(2.65));

    }

}
