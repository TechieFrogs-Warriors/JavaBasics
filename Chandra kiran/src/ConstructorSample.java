public class ConstructorSample 
{
    ConstructorSample()
    {
        System.out.println("print this constructor");
    }
    ConstructorSample(int a,int b)
    {
        
        
        int c=a+b;
        System.out.println(c);

    }
    ConstructorSample(int d,String S)
    {
        
        if(d%2==0)
        {
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
        ConstructorSample obj = new ConstructorSample();
        ConstructorSample obj1 = new ConstructorSample(30,70);
       ConstructorSample obj2= new ConstructorSample(8, "the number is even");
    }
}
