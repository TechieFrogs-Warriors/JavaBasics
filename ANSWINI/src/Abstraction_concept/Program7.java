package Abstraction_concept;

public class Program7 
{
    public static void main(String[] args) 
    {
        Circle c=new Circle();
        System.out.println("Area of circle: "+c.getArea()+"Perimeter of circle: "+c.getPerimeter());
       
        Circle c1=new Circle(2.5);
        System.out.println("\n\nArea of Circle : " + c1.getArea() + "\nperemeter of circle : " + c1.getPerimeter());
        
        Circle c2=new Circle(2.0, "blue", true);
        System.out.println("\n\nArea of Circle : " + c2.getArea() 
        + "\nperemeter of circle : " + c2.getPerimeter() + "\ncolor : " + c2.getColor() + "\nfilled : " + c2.isFilled());
        
        Rectangles r=new Rectangles();
        System.out.println("Area of rectangle: "+r.getArea()+"Perimeter of rectangle: "+r.getPerimeter());
       
        Rectangles r1 = new Rectangles(3.0, 4.2);
        System.out.println("\n\nArea of Rectangle : " + r1.getArea() + "\nPerimeter of rectangle : " + r1.getPerimeter());
        
        Rectangles r2 = new Rectangles(2.1, 7.3, "purple",false);
        System.out.println("Area of Rectangle : " + r2.getArea() + "\nPerimeter of rectangle : " + r2.getPerimeter()
        + "\ncolor : " + r2.getColor() + "\nfilled : " + r2.isFilled());
        
    }
    
}
abstract class Shapes
{
    protected String color="red";
    protected boolean filled=true;
    public Shapes()
    {
        color="red";
        filled=true;
    }
    public Shapes(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    //setter and getter for private variables "color" and "filled"
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString()
    {
        return "Shape [ color = " + color + " filled = " + filled + " ]";
    }
}
class Circle extends Shapes
{
    private double radius=1.0;
    public Circle()
    {
        this.radius=1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        super(color,filled);//superclass constructor invoked with two arguments
        this.radius=radius;  
    }
    //setter and getter for private variable "radius"
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()//method
    {
        return radius*radius*Math.PI;
    }
    public double getPerimeter()//method
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "Shape[Circle [ color = " + color + " filled = " + filled + " ]  radius = " + radius + " ]";
    }

}
class Rectangles extends Shapes
{
    protected double width=1.0;
    protected double length=1.0;
    public Rectangles()
    {
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangles(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangles(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getLength()
    {
        return length;
    }
    public double getArea()//method
    {
        return length*width;
    }
    public double getPerimeter()//method
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "shape[Rectangle [ color = " + color + " filled = " + filled + " ]  length = " + length + " width = "
        + width + " ]";

    }
}
class Squares extends Rectangles
{
    private double side=4.5;
    public Squares()
    {
       this.side=4.5;
    }
    public Squares(double side)
    {
        this.side=side;
    }
    public Squares(double side,String color,boolean filled)
    {
        //super(width, length, color, filled);
        this.side=side;
        this.color=color;
        this.filled=filled;
        
    }
    void setSide(double side)
    {
        this.side=side;
    }
    double getSide()
    {
        return this.side;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public String toString()
    {
        return "Shape[Square [ color = " + color + " filled = " + filled + " ]  length = " + length + " width = "
        + width + " ]";

    }

}
