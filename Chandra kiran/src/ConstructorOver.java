 class Over 
{
   Over()
    {
    
        System.out.println("print this constructor");
    }
    Over(int a,int b)
    {
        this(8, "print");
        
        
        int c=a+b;
        System.out.println(c);
        
    }
    Over(int d,String S)
    {
        this();
        
        if(d%2==0)
        {
            for(int i=1;i<=d;i++)
            {
                for(int j=1;j<=i;j++)
                {
                System.out.print(j);
                }
                System.out.println();
            }
            System.out.println(S);

        }
        else
        {
            S="the num is not even";
            System.out.println(S);
        }
        
    }
    
    public static void main(String[] args) 
    {
        
        Over obj1 = new Over(50, 45);
        
    }
    
}
