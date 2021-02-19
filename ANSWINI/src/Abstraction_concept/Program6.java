package Abstraction_concept;

public class Program6 
{
    public static void main(String[] args) 
    {
        Area a=new Area();
        a.rectangleArea(4, 5);
        a.squareArea(4);
        a.circleArea(2);
    }
    
}
abstract class Shapes2
{
    abstract void rectangleArea(double length,double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}
class Area extends Shapes2
{
    void rectangleArea(double length,double breadth)
    {
        double area=length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
    void squareArea(double side)
    {
        double area=side*side;
        System.out.println("Area of square is: "+area);
    }
    void circleArea(double radius)
    {
        double area=radius*radius*Math.PI;
        System.out.println("Area of square is: "+area);
    }

}
