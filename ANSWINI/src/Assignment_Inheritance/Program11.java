package Assignment_Inheritance;

public class Program11 
{
    public static void main(String[] args) 
    {
        Cylinder c1 = new Cylinder();
        System.out.println("Radius is " + c1.getRadius());
        System.out.println("Height is " + c1.getHeight());
        System.out.println("Color is " + c1.getColor());
        System.out.println("Base area is " + c1.getArea());
        System.out.println("Volume is " + c1.getVolume());
        System.out.println();//for clarity in output
        Cylinder c2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + c2.getRadius());
        System.out.println("Height is " + c2.getHeight());
        System.out.println("Color is " + c2.getColor());
        System.out.println("Base area is " + c2.getArea());
        System.out.println("Volume is " + c2.getVolume());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
    }
}
class Circles 
{
    private double radius;
    private String color;
    Circles() //default constructor
    {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a Circle");
    }
    Circles(double radius) //single parameter constuctor
    {
        this.radius = radius;
        this.color = "red";
        System.out.println("Construced a Circle with radius");
    }
    Circles(double radius, String color) //two parameterized constructor
    {
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with radius, color");
    }
    //getters and setters for private variables
    double getRadius() 
    {
        return this.radius;
    }
    String getColor() 
    {
        return this.color;
    }
    void setRadius(double radius) 
    {
        this.radius = radius;
    }
    void setColor(String color) 
    {
        this.color = color;
    }
    // Returns a self-descriptive String 
    public String toString() 
    {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
    // Returns the area of this Circle 
    double getArea() 
    {
        return radius * radius * Math.PI;
    }
}
class Cylinder extends Circles 
{
    private double height;
    Cylinder() //default constructor of cylinder class
    {
        super();  // invoke superclass constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder ");
    }
    Cylinder(double height) 
    {
        super();  // invoke superclass constructor Circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with height");
    }
    Cylinder(double height, double radius) 
    {
        super(radius);  // invoke superclass constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with height, radius");
    }
    Cylinder(double height, double radius, String color) 
    {
        super(radius, color);  // invoke superclass constructor Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with height, radius, color");
    }
    // Getter and Setter methods for private variables
    double getHeight() 
    {
        return this.height;
    }
    void setHeight(double height)
    {
        this.height = height;
    }
    double getArea() //overriding parent getArea() method
    {
        return 0;
    }
    // Returns the volume of this Cylinder 
    public double getVolume() 
    {
        return super.getArea()*height;   // Using parent class getArea() method
    }
    // Returns a self-descriptive String 
    public String toString() 
    {   
        // using  parent class toString() method
        return "Cylinder: subclass of " + super.toString()   + " height=" + height;
    }
}