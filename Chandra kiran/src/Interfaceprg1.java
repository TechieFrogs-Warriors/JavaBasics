interface RegularPolygon
{
    final int sum=0;
    public int getNumSides(int n);
    public int getSideLength(int );
    static int totalSides()
    {
        return sum=
    }
    default int getPerimeter(int length)
    {
        
        return n*length;
    }
    default int getInteriorAngle()
    {
        return ((n-2)*n)/n;
    }
}
class EquilateralTriangle implements RegularPolygon
{

  public int getNumSides(int n)
    {
        n=3;
        return n;
    }
    EquilateralTriangle(int a)
    { 
        
        
    }
   public int getSideLength()
    {
        return n;

    }
}
class square implements RegularPolygon
{
    
    public int getNumSides(int n)
    {
         n=4;
        return n;
    }
    square(int a)
    {
        this.a=a;
        

    }
    public int getSideLength()
    {
        return a;
    }
}
public class Interfaceprg1 
{
    public static void main(String[] args) 
    {
        
    }
    
}
