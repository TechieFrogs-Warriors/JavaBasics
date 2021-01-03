import java.util.Scanner;
public class PyramidRevNumStar 
{
    public static void main(String[] args) 
    {
        Scanner N= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!N.hasNextInt())
            {
                String input = N.next();
                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=N.nextInt();
        }while(n<0);
         int i,j;
         for(i=n;i>=1;i--)
         {
             /*  for(j=1;j<=i;j++)
              {
                 System.out.print(j);

              }
              
              while(j>i&&j<=n)
              {
                  System.out.print("*");
                  j++;
              }
              System.out.println();*/
              

              for(j=i;j>=1;j--)
              {
                  System.out.print(j);
                
              }
              System.out.println();
              while(j<=0|j<i)
              {
                System.out.print("*");
                j++;
                
              } 
              
            
             
         }
         
           N.close();
    }
    
}