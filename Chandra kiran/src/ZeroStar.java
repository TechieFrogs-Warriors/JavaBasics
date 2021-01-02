import java.util.Scanner;
public class ZeroStar
{
    public static void main(String[] args)
     {
        Scanner Z = new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!Z.hasNextInt())
            {
                String input = Z.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
            n=Z.nextInt();
        }while(n<0);
        int i,j;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=n;j++)
             { 
                 if(j==i)
                 {
                     System.out.print("*");
                  }
                  else
                  {
                      System.out.print(0);

                  }
             }
              for(j=5;j>=1;j--)
              {
                  if(j==5||j==i)
                  {
                      System.out.print("*");

                  }
                  else
                  {
                      System.out.print(0);
            
                  }
              }
              System.out.println();
          
        }
        
         Z.close();
    }
}

    
    

