class Rectangle
{
    int length,breadth;
    
     Rectangle(int l,int b)
     { 
         length=l;
         breadth=b;
    
     }
     void Area()
     {
         int area=length * breadth;
         System.out.println("Area of Rectangle "+area+ " length: "+length+" breadth "+breadth);

     }
}
public class ClassObj5 
{
    public static void main(String[] args) 
    {
    Rectangle Obj= new Rectangle(4,5);
    Obj.Area();
    Rectangle Obj1=new Rectangle(5,8);
    Obj1.Area();
    }
    
    
}
