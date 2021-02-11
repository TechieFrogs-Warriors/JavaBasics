class Rectangle7
{
    int Length;
    int Breadth;
    public void Area()
    {
        int area=Length*Breadth;
        System.out.println("Area of Rectangle "+area);
    }
    public void Perimeter()
    {
        int perimeter = 2*(Length+Breadth);
        System.out.println("Perimeter of Rectangle "+perimeter);

    }
    
    Rectangle7(int l,int b)
    {
        Length=l;
        Breadth=b;

    }

}
class Square7 extends Rectangle7
{
    int Side;
    Square7(int s)
    {
        
      super(s, s);
      this.Side=s;

    }
    public void Area()
    {
        super.Area();
        int area=Side*Side;
        System.out.println("Area of Square "+area);
    }
    public void Perimeter()
    {
        super.Perimeter();
        int perimeter = 4*Side;
        System.out.println("Perimeter of Square"+perimeter);

    }

}
public class Assessment2 
{
    public static void main(String[] args) 
    {
        Square7 obj = new Square7(70);
        obj.Area();
        obj.Perimeter();
        
    }
    
}
