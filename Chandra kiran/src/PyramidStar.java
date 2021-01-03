import java.util.Scanner;
public class PyramidStar 
{
    public static void main(String[] args) 
    {
        Scanner S= new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!S.hasNextInt())
            {
                String input = S.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=S.nextInt();


        }while(n<0);
        int i,k=0;
    
        for(i=1;i<=n;i++)//outer for loop
        {
            for(int space=1;space<=(n-i);space++)//for loop to print space
            {
                System.out.print(" ");
            }
        
          while(k !=(2*i-1))
           {
             System.out.print("* ");
              ++k;
            }
          k=0;
          System.out.println();
       }
      S.close();   
    }

    
}
