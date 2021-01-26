package Interfaceprograms;

interface RegularPolygon {
    public int num = 4;
    public double length = 3.25;

    int getNumSides();

    int getSideLength();

    default void getPerimeter(int num, double length) {
        System.out.println(num * length);
    }

    default void getInteriorAngle(int num1, double radius) {
        System.out.println((((num1) - 2) * (Math.PI) / radius) * 2);
    }
}

class EquilateralTriangle implements RegularPolygon {
    int k;

    public EquilateralTriangle() {
        k = 10;
    }

    public int getNumSides() {
        return 3;
    }

    public int getSideLength() {
        return k;

    }
}

class Square1 implements RegularPolygon {
    int l;

    public Square1() {
        l = 10;
    }

    public int getNumSides() {
        return 4;
    }

    public int getSideLength() {
        return l;

    }
}

public class Excercises1 {
    public static void main(String[] args) {

        RegularPolygon obj = new EquilateralTriangle();
        System.out.println(obj.getNumSides() + "\n" + obj.getSideLength());
        obj.getPerimeter(4, 2.25);
        obj.getInteriorAngle(2, 2.5);

        RegularPolygon obj1 = new Square1();
        System.out.println("\n\n" + obj1.getNumSides() + "\n" + obj1.getSideLength());
        obj1.getPerimeter(4, 3.25);
        obj1.getInteriorAngle(2, 2.5);

    }

}
