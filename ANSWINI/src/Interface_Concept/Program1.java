package Interface_Concept;

public class Program1 
{
    public static void main(String[] args) 
    {
        EquilateralTriangle e=new EquilateralTriangle(5);
        System.out.println("number of sides of equilateral triangle: "+e.getNumSides());
        System.out.println("length of side  of equilateral triangle: "+e.getSideLength());
        
        Square s=new Square(2);
        System.out.println("number of sides of Square: "+s.getNumSides());
        System.out.println("length of side  of Square: "+s.getSideLength());  
    }
    
}
interface RegularPolygon
{
    int getNumSides();
    int getSideLength();
}
class EquilateralTriangle implements RegularPolygon
{
    int v;
    public EquilateralTriangle(int value)
    {
        v=value;
    }
    public int getNumSides()
    {
        return 3;
    }
    public int getSideLength()
    {
        return v;
    }

}
class Square implements RegularPolygon
{
    int v;
    Square(int value)
    {
        v=value;
    }
    public int getNumSides()
    {
        return 4;
    }
    public int getSideLength()
    {
        return v;
    }
}

