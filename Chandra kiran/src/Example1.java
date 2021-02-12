import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value ");
        int n=scan.nextInt();
        int x=n,y=n;
        int m=1,l=n*2-1;
        int z=1;
        for(int i=1;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=z;k++)
            {
               System.out.print("* ");
            }
            z++;
           System.out.println();
        }
        scan.close();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n*2;j++)
            {
                if(j==m||j==l)
                {
                   System.out.print(i); 
                }
                else
                {
                    System.out.print(" ");
                }
            }
            m++;
            l--;
            
            System.out.println();

        }
       for(int i=n;i>=1;i--)
       {
           for(int j=1;j<n*2;j++)
           {
               if(j==x||j==y)
               {
                   System.out.print(i);
               }
               else
               {
                   System.out.print(" ");
               }
           }
           x--;
           y++;
           System.out.println();
       }
        scan.close();
    }
    
}
