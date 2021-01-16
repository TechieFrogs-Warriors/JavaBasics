class Area1
{
    int l,b;
    Area1(int length,int breadth)
    {
        l=length;
         b=breadth;
      System.out.println("length:"+l+" breadth "+breadth);

    }
    void returnArea()
    {
        int area=l*b;
        System.out.println("Area "+area);

    }

}
public class ClassObj7 
{
    public static void main(String[] args) 
    {
        Area1 obj= new Area1(10, 20);
         obj.returnArea();
    }
    
}
