class Area
{
    int length,breadth;
    void SetDim(int l,int b)
    {
        length=l;
        breadth=b;
        System.out.println("length "+length+" Breadth "+breadth);
        
    }
     void getArea()
    {
      int area=length*breadth;
       System.out.println("Area "+area);
    }
}
public class ClassObj6 
{
    public static void main(String[] args) 
    {
        Area Obj = new Area();
        Obj.SetDim(6,8);
        Obj.getArea();
    
        
    }
    
}
