public class ArraysPrg32 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c=0,d=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]%2==0)
                {
                    c++;
                }
                else
                {
                    d++;
                }
            }
        }
        System.out.println("Frequency of Even numbers-"+c);
        System.out.println("Frequency of Odd numbers-"+d);
        
    }
    
}
