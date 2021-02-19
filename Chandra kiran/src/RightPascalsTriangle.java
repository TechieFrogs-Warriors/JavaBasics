import java.util.Scanner;
public class RightPascalsTriangle 
{
    public static void main(String[] args)
     {
        Scanner D= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!D.hasNextInt())
            {
                String input = D.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=D.nextInt();


        }while(n<0);

        int i,j;
         for(i=1;i<=n;i++)//outer for loop
         {
              for(j=1;j<=i;j++)//inner for loop
              {
                  System.out.print("* ");//prints stars
              }
             System.out.println();
          }
         
         for(i=7;i>=1;i--)//outer for loop
         {
             for(j=1;j<=i;j++)// inner for loop  
             {
                 System.out.print("* ");// prints stars
             }
                System.out.println();
           }
         D.close();
    }
    
}

    

    
    


    
    

