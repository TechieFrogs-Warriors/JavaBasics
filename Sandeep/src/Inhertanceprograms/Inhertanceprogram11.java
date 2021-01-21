package Inhertanceprograms;

class Circle1 {
    private double radius;
    private String color;

    public Circle1() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Empty Circle");
    }

    public Circle1(double radius) {
        this.radius = radius;
        System.out.println("radius Circle");
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("radius color Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle [raduis = " + radius + " color = " + color + "]";
    }

}

class Cylinder extends Circle1 {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
        System.out.println("Empty Cylinder");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("height cylinder");
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("height radius Cylinder");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("height radius color Cylinder");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getvolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        super.getArea();
        // System.out.println(super.getArea());
        return (2 * Math.PI * getRadius() * height) + (2 * getRadius() * getRadius());
    }

}

public class Inhertanceprogram11 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        System.out.println("Radius: " + obj.getRadius() + "\nHeight: " + obj.getHeight() + "\ncolor: " + obj.getColor()
                + "\nArea: " + obj.getArea() + "\nvolume: " + obj.getvolume());

        System.out.println(obj.toString() + "\n\n");

        Cylinder obj2 = new Cylinder(5.0, 2.0, "red");
        System.out.println("Radius: " + obj2.getRadius() + "\nHeight: " + obj2.getHeight() + "\ncolor: "
                + obj2.getColor() + "\nArea: " + obj2.getArea() + "\nvolume: " + obj2.getvolume());
        System.out.println(obj2.toString());

    }
}
