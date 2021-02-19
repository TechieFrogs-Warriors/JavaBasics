package Assignment_Inheritance;

public class Program6 
{
    public static void main(String[] args) 
    {
        Squares sq = new Squares();  // creating object of Square class
        sq.print_Shape();    // Object of Square class calling function of Shape class
        sq.print_Rect();    // Object of Square class calling function of Rectangle class 
    }
    
}
class Shape
{
    void print_Shape()
    {
        System.out.println("This is shape");
    }
}
  
// Rectangle class is subclass of Shape class
class Rectangles extends Shape
{
    void print_Rect()
    {
        System.out.println("This is rectangular shape");
    }
}
  
// Circle class is subclass of Shape class
class Circle extends Shape
{
    public void print_circle()
    {
        System.out.println("This is circular shape");
    }
}
  
// Square class is subclass of Rectangle class
class Squares extends Rectangles
{
    void print_square()
    {
        System.out.println("Square is a rectangle");
    }
}