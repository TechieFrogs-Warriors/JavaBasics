class Pattern 
{
    private String pattern;
    protected int g;
     Pattern()
    {
        System.out.println("default pattern ");
    }
   public String getpattern()
   {
       return pattern;
   }
   public void setpattern(String pattern)
   {
       this.pattern=pattern;
   }
    Pattern(int a)
    {
        this();
        
       for(int b=1;b<=a;b++)
       {
           for(int c=1;c<=b;c++)
           {
               System.out.print(c);
           }
         System.out.println();
       }

    }


}
class Star extends Pattern
{
    
    Star()
    {
        System.out.println("default Star");
    }
    Star(int d)
    {
        
         super(7);
       for(int e=1;e<=d;e++)
        {
            for(int f=1;f<=e;f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class InheritenceExample 
{
    public static void main(String[] args) 
    {
        Star Obj = new  Star(7);
        Obj.g=2;
        Obj.setpattern("*123*");
        System.out.println(Obj.getpattern());
        
    }

}
