public class ArraysExample2 
{
    static void even(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(+a[i]+" is even number ");
            }
            else if(a[i]%2==1)
            {
                System.out.println(+a[i]+" is odd number");
            }
        }
    }
    public static void main(String[] args) 
    {
        int a[]={5,10,15,20,25,30};
        even(a);
        
    }
    
}
