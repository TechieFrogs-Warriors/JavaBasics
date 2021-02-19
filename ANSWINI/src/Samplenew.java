public class Samplenew 
{
    public static void main(String[] args) 
    {
       Samplenew obj=new Samplenew();
       obj.m();
      float c=obj.n(2.245f, 5.2454f);
      System.out.println("method with return type and parameters=  "+c);
      obj.SampleNew();
      //class of other program is accessed here for getter and setter methods for private data members
      Encap e=new Encap();
      e.setEmpAge(30);
      System.out.println(e.getEmp());
      
    }
    void m()
    {
        int a=20,b=40,c=a+b;
        int d=b-a;
        int f=b/a;
        int g=a*b;
        System.out.println("add= "+c);
        System.out.println("subtract= "+d);
        System.out.println("division= "+f);
        System.out.println("multiply= "+g);
    }
    float n(float a,float b)
    {
        return a+b;
    }
    Samplenew()
    {
        System.out.println("im constructor");
        int n=25;
        if(n%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
    void SampleNew()
    {
        System.out.println("method with classname");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j); 
            }
            
            System.out.println();
        }
    }    
    
}


