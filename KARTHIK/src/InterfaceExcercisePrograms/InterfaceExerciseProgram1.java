package InterfaceExcercisePrograms;

public class InterfaceExerciseProgram1 {
    public static void main(String[] args) {
        RegularPolygon obj = new EquilateralTriangle();
        System.out.println("Number Of Sides: "+obj.getNumSides()  );
        System.out.println("length Of The Side: "+obj.getSideLength());
        obj.getPerimeter(6, 3.25);
        obj.getInteriorAngle(8, 8.26);

        RegularPolygon obj1 = new Square1();
        System.out.println("Number Of Sides:"+ obj1.getNumSides() );
        System.out.println("Length Of The sisde: "+obj1.getSideLength());
        obj1.getPerimeter(7,58.36);
        obj1.getInteriorAngle(9,7.35);
    }
    
}
interface RegularPolygon {
    abstract int getNumSides();
    abstract int getSideLength();
    default void getPerimeter(int num, double length) {
        System.out.print("Perimeter:");
        System.out.println(num * length);
    }
    default void getInteriorAngle(int num1, double radius) {
        System.out.print("Interior Angle:");
        System.out.println((((num1) - 2) * (Math.PI) / radius) * 2);
    }
}
class EquilateralTriangle implements RegularPolygon {
    int k;
    public EquilateralTriangle() {
        k = 0;
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
        l = 0;
    }
    public int getNumSides() {
        return 4;
    }
    public int getSideLength() {
        return l;

    }
}