public class ArraysExample4 
{
    static void Print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]/2);

        }

    }
    public static void main(String[] args) 
    {
        Print(new int[]{30,60,50,20});
        Print(new int[]{20,40,50,60});
        
    }
    
}
