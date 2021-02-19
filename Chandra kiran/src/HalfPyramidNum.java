import java.util.Scanner;
public class HalfPyramidNum 
{
    public static void main(String[] args) 
    {
        Scanner H= new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!H.hasNextInt())
            {
                String input = H.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=H.nextInt();


        }while(n<0);
        
        int i,j;
         for(i=1;i<=n;i++)//outer for loop
         {
             for(j=1;j<=i;j++)// inner for loop
             {
                 System.out.print(j);//prints the j value
             }
               System.out.println();
           }
         H.close();
    }
    
}


    

