import java.util.Scanner;

public class Example2 
{
    public static void main(String[] args) 
    {
        Scanner Sc= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter positive number");
            while(!Sc.hasNextInt())
            {
                String S = Sc.next();
                System.out.printf("\"%s\"is not a valid number \n"+S);

            }
            n=Sc.nextInt();
        }while(n<0);
        char ch='A';
        
        // for(int i=n;i>=-n;i--)
        // {
        //     for(int j=0;j<=Math.abs(i);j++)
        //     {
        //         System.out.print((char)(ch+j)+" ");
        //     }
            
            //  for(int j=Math.abs(i);j>=0;j--)
            //  {
            //      System.out.print((char)(ch+j)+" ");
            //  }
        //      System.out.println();
        // }
        for(int i=0;i<=n;i++)
        {
           for(int j=0;j<=n-i;j++) 
           {
               System.out.print((char)(ch+j));
           }
           for(int k=1;k<=2*i-1;k++)
           {
               System.out.print(" ");
           }
           for(int j=n-i;j>=0;j--)
           {
               if(j!=n)
               System.out.print((char)(ch+j));
           }
           System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print((char)(ch+j));
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(" ");

            }
            for(int j=n-i;j>=0;j--)
            {
                if(j!=n)
                {
                  System.out.print((char)(ch+j));
                }
            }
            System.out.println();
        }
    
        // for(int i=0;i<=n;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=n;j++)
        //     {
        //         System.out.print((char)(ch+j)+" ");
        //     }
            // for(int j=n-1;j>=i;j--)
            // {
            //     System.out.print((char)(ch+j));
            // }
            
        //     System.out.println();
        // }
        // for(int i=n;i>=0;i--)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=n;j++)
        //     {
        //         System.out.print((char)(ch+j)+" ");
        //     }
        //     System.out.println();
        // }
        Sc.close();
        
    }
    
}
