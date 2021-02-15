public class Prac 
{
    public static void main(String[] args) 
    {
        int n=5;
    {
        for(int i=n;i>=-n;i--)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=Math.abs(i);j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
    }
    
}
