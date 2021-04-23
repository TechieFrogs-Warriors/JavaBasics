import java.util.Scanner;

public class Pattern 
{
    public static void main(String[] args) 
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=n-1;k>=i;k--)
            
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
            obj.close();
        }
        
        
    }
    
}
