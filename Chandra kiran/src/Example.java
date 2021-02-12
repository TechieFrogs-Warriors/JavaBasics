import java.util.Scanner;
public class Example 
{
    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter size ");
        int n=Scan.nextInt();
        
        for(int i=n;i>=-n;i--)
        {
            for(int j=1;j<=Math.abs(i);j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>=Math.abs(i);k--)
            {
                System.out.print("* ");
            }
            
            // for(int k=0;k<=Math.abs(i);k++)
            // {
            //     System.out.print((char)(ch+k));
            // }

            System.out.println();
        }
        // for(int i=0;i<=n;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //         for(int k=0;k<=n-i;k++)
        //         {
        //              System.out.print((char)(ch+k)+" ");
        //           }
        //     System.out.println();
        // }
        Scan.close();
    }

    
}
