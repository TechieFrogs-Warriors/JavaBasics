public class InheritancePracticeProgram11 {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();
        System.out.println("Radius: " + obj1.getRadius());
        System.out.println("Height: " + obj1.getHeight());
        System.out.println("color: " + obj1.getColor());
        System.out.println("Area: " + obj1.getArea());
        System.out.println("volume: " + obj1.getvolume());
        System.out.println(obj1.toString());
        Cylinder obj2 = new Cylinder(5.0, 2.0, "red");
        System.out.println("Radius: " + obj2.getRadius());
        System.out.println("Height: " + obj2.getHeight());
        System.out.println("color: "+ obj2.getColor());
        System.out.println("Area: " + obj2.getArea());
        System.out.println("volume: " + obj2.getvolume());
        System.out.println(obj2.toString());   
    }  
}
class Circle1 {
    private double radius;
    private String color;

    public Circle1() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle1(double radius) {
        this.radius = radius;
        System.out.println("Radius Of The Circle");
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Radius And color Of The Circle");
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
        return "raduis: " + radius +" "+ "color: "+color;
    }

}

class Cylinder extends Circle1 {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Height Of The Cylinder");
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Height And Radius Of The Cylinder");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Height,Radius And Colour Of The Cylinder");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getvolume() {
        return getArea() * height;
    }
}