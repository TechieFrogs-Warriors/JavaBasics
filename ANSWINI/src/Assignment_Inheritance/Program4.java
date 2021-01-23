package Assignment_Inheritance;

public class Program4 
{
    public static void main(String[] args) 
    {
        
        Square sq=new Square(4);
        sq.getArea();
        sq.getPerimeter();
 
    }
    
}
class Rectangle
{
    double length;
    double breadth;
    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    void getArea()
    {
        System.out.println("Area of rectangle: "+length * breadth);
    }

    void getPerimeter()
    {
        System.out.println("Perimeter of Rectangle: "+2 * (length + breadth));
    }
}
class Square extends Rectangle
{
    double  side;
    Square(double s)
    {
        super(s,s);//invoking parent class constuctor with arguments explicitly
        side=s;
    }
    void getArea()
    {
        super.getArea();
        System.out.println("Area of Square: "+side*side);
        
    }
    void  getPerimeter()
    {
        super.getPerimeter();
        System.out.println("Perimeter of Square: "+4*side);
        

    }

}
