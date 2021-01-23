class number 
{
    static double even(int a,int b)
    {
       if(a%2==0&&b%2==1)
        {
            System.out.println("a is even");
            System.out.println("b is odd");
        }
        return a+b;

    }
    static double even(double a,double b )
    {
        if(a%2==1&&b%2==0)
        {
            System.out.println("a is odd");
            System.out.println("b is even");
        }
        return a+b;

    }


}
public class PolymorphismOverloading2 
{
    public static void main(String[] args) 
    {
       System.out.println(number.even(100, 200));
      System.out.println(number.even(769.90, 87970.8));
    }
    
}
