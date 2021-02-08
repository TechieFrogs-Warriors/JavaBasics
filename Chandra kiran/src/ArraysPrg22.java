public class ArraysPrg22 
{
    public static void main(String[] args) 
    {
        int a[]={20,35,40,55,60,75};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]+" is Even number");
            }
            else
            {
                System.out.println(a[i]+" is Odd number");
            }
        }
        
    }
    
}
