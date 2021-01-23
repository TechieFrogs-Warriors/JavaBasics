abstract class Shape2
{
    protected String color;
    protected Boolean filled;
    Shape2()
    {
        this.color="red";
        this.filled=true;

    }
    Shape2(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getcolor() 
    {
        return color;
    }
    public void setcolor(String color)
    {
        this.color=color;
    }
    public boolean isfilled()
    {
        return filled;
    }
    public void setfilled(boolean filled)
    {
        this.filled=filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString()
    {
        return "Shape[color=?,filled=?]";
    }
}
class Circle5 extends Shape2
{
   private double radius;
   Circle5()
   {
       super();
       this.radius=1;
   }
   Circle5(double radius)
   {
       super();
       this.radius=radius;

   }
   Circle5(double radius,String color,boolean filled)
   {
       super(color, filled);
       this.radius=radius;

   }
   public double getRadius() 
   {
       return radius;
   }
   public void setradius(double radius)
   {
       this.radius=radius;
   }
   public double getArea()
   {
       return 3.14*(radius*radius);
    }
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
    public String toString()
    {
        return "Circle[Shape[color=?,filled=?],radius=?";
    }

}
class Rectangle5 extends Shape2
{
    protected double width;
    protected double length;
    Rectangle5()
    {
        super();
        this.width=1.0;
        this.length=1.0;
    }
    Rectangle5(double width,double length)
    {
        super();
        this.width=width;
        this.length=length;
    }
    Rectangle5(double width,double length,String color,boolean filled)
    {
        super(color, filled);
        this.width=width;
        this.length=length;

    }
    public double getwidth() 
    {
        return width;
    }
    public void setwidth(double width) 
    {
        this.width = width;
    }
    public double getlength() 
    {
        return length;
    }
    public void setlength(double length) 
    {
        this.length = length;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle[Shape[color=?,filled=?],width=?,length=?]";
    }

}
class Square1 extends Rectangle5
{
    protected  double side;
    Square1()
    {
        super();
        this.side=1.0;
    }
    Square1(double side)
    {
        super();
        this.side=side;

    }
    Square1(double side,String color,boolean filled)
    {
        super(side,side);
        this.side=side;
    }
    public double getside() 
    {
        return side;
    }
    public void setside(double side)
    {
        this.side=side;
    }

    public void setwidth(double side) 
    {
        this.side=side;
    }
    public void setlength(double side)
    {
        
        this.side=side;
    }
    public String toString()
    {
        return "Square[Rectangle[Shape[color=?,filled=?],width=?,length=?]]";
    }
        
    
}

public class AbstractPrg7 
{
    public static void main(String[] args) 
    {
        Rectangle5 obj = new Rectangle5();
        Circle5 obj1 = new Circle5();
        System.out.println("Length "+obj.getlength());
        System.out.println("Color "+obj.getcolor());
        System.out.println("Width "+obj.getwidth());
        System.out.println("Area of rectangle "+obj.getArea());
        System.out.println("Perimetre of Rectangle "+obj.getPerimeter());
        System.out.println("Radius "+obj1.getRadius());
        System.out.println("Area of Circle "+obj1.getArea());
        System.out.println("Perimeter of Circle "+obj1.getPerimeter());
        System.out.println(obj.toString());
        System.out.println(obj1.toString());

        
    }
    
}
