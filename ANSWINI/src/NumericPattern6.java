import java.util.Scanner;

public class NumericPattern6 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i==j)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            for(int j=1;j<n;j++)
            {
                if(i+j==n-1)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int k=n-2;k>=1;k--)
        {
            for(int j=1;j<n;j++)
            {
                if(k==j)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            for(int j=1;j<n-1;j++)
            {
                if(k+j==n-1)
                System.out.print(k);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    
        obj.close();
        
    }
    
}
