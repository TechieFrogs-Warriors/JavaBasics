 class Access
{
  private int Add(int a ,int b)
    {
        int c=a+b;
        System.out.println(c);
        return c;
    
    }
 int sub(int d,int e)
    {
        int f=d-e;
        System.out.println(f);
        return Add(50, 50);
    }
    protected int mul(int g,int h)
    {
        int i=g*h;
        System.out.println(i);
        return sub(78, 89);

    }
    
    
    
}
 
public class AccessModifiers 
{
    public static void main(String[] args) 
    {
        Access Obj = new Access();
       //Obj.Add(30,60);
        Obj.sub(70, 50);
        Obj.mul(30, 70);
        
    }
    
}
