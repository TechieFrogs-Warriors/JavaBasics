public class InheritancePracticeProgram11 {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();
        System.out.println("****Circle And Cylinder Detais****"); 
        System.out.println("Radius: "+obj1.getRadius());
        System.out.println("Colour: "+obj1.getColor());
        System.out.println("Height: "+obj1.getHeight());
        System.out.println("Surface Area of The Cylinder: "+obj1.getArea());
        System.out.println("Volume Of The Cylinder: "+obj1.getvolume());
        System.out.println(obj1.toString());
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
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
        //System.out.println("Area Of The Circle:");
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "["+"raduis: " + radius +" "+ "color: "+color+"]";
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
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        System.out.println("Area Of The Circle: "+super.getArea());
        //System.out.println("Surface Area Of The Cylinder:");
        double SurfaceArea=(2*Math.PI*getRadius()*(getRadius()+getHeight()));
        return SurfaceArea;
    }

    public double getvolume() {
       // System.out.println("Volume Of The Cylinder:");
        return super.getArea() * height;
    }
}