import java.util.Scanner;
public class NumX 
{
    public static void main(String[] args) 
    {
        Scanner Z=new Scanner(System.in);
        int n;
        do{
            System.out.println("enter positive number");
            while(!Z.hasNextInt())
            {
                String input = Z.next();
   
                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=Z.nextInt();
   
   
        }while(n<0);
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(j);

                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<n;j++)
            {
                if(i+j==n-1)
                {
                    System.out.print(i);

                }
                else
                {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
        for(int k=n-2;k>=1;k--)
        {
            for(int j=1;j<n;j++)
            {
                if(k==j)
                {
                    System.out.print(j);
                    
                }
                else
                {
                    System.out.print(" ");

                }
            }
            for(int j=1;j<n-1;j++)
            {
                if(k+j==n-1)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
        Z.close();
    }
    
}
