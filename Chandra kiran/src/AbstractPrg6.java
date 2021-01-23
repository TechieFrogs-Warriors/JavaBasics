abstract class Shape1
{
    public abstract void RectangleArea(int length,int breadth);
    public abstract void SquareArea(int side);
    public abstract void CircleArea(double radius);
}
class Area3 extends Shape1
{
    public void RectangleArea(int length,int breadth)
    {
        int area=length*breadth;
        System.out.println("Area of Rectangle "+area);
    }
    public void SquareArea(int side)
    {
        int area=side*side;
        System.out.println("Area of Square "+area);
    }
    public void CircleArea(double radius)
    {
        double area=3.14*(radius*radius);
        System.out.println("Area of Circle "+area);
    }
}
public class AbstractPrg6 
{
    public static void main(String[] args) 
    {
        Area3 obj = new Area3();
        obj.RectangleArea(30, 70);
        obj.SquareArea(60);
        obj.CircleArea(50);
        
    }
    
}
