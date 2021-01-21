class Rectangle1
{
    int length;
    int breadth;
    void Area()
    {
      int area=length*breadth;
      System.out.println("Area of Rectangle "+area);
    }
    void Perimeter()
    {
      int  perimeter =2*(length+breadth);
        System.out.println("Perimeter of Rectangle "+perimeter);

    }
    Rectangle1(int l,int b)
    {
        length=l;
        breadth=b;

    }
}
class Square extends Rectangle1
{
    int s;
    
    Square(int s)
    {
         super(s,s);
         this.s=60;
    }
     void Area()  
     {
         super.Area();
        int area = s*s;
        System.out.println("Area of Square "+area);
    }
   void Perimeter()
    {
        super.Perimeter();
       int Perimeter = 4*s;
       System.out.println("Perimeter of Square "+Perimeter);

    }
}
public class Inheritance4 
{
    public static void main(String[] args) 
    {

        Square Obj = new Square(60);
        Obj.Area();
        Obj.Perimeter();
        
    }
}
