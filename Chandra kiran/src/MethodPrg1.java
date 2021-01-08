class PrintNumber
{
  public int printn(int a,int b,int x)
  {
        x=a+b;
      return x;
  }
 public  float printn(int g,int h)
  {
     float i=g/h;
     return i;
  }
  public char printn(char c)
  {
    return c;
  }
  public String printn(String s)
  {
    
    return s;

  }

}

public class MethodPrg1
{
    public static void main(String[] args) 
    {
        PrintNumber arth= new PrintNumber();
         System.out.println(arth.printn("Output is"));
        int m=arth.printn(30,70,0);
        System.out.println(m);
        char l=arth.printn('v');
        System.out.println(l);
        float n=arth.printn(70,6);
        System.out.println(n);
        System.out.println(printn(2000,40000));
        System.out.println(printn(70));
        
    }
    public static long printn(int p,int q)
    {
        long o=p*q;
        return o;
    }
   public static short printn(int z)
   {
          Short y=30;
    
       return y ;
   }
    
}
