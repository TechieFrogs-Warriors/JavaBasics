class Shape
{
    void shape()
    {
        System.out.println("This is the Shape");

    }
}
class Rectangle2 extends Shape
{
    void rectangle()
    {
        System.out.println("This is rectangular shape");
    }

}
class Circle extends Shape
{
    void circle()
    {
        System.out.println("This is circular shape");
    }

}
class Square1 extends Rectangle2
{
    void square()
    {
        System.out.println("Square is a Rectangle");
    }
}
public class Inheritance6 
{
    public static void main(String[] args) 
    {
        Square1 Obj = new Square1();
        Obj.shape();
        Obj.rectangle();
        
    }
    
}
