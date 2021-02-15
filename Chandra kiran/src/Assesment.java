import java.util.Scanner;

public class Assesment 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int row;
        //validation..
        do
        {
            System.out.println("Enter positive number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered value is not valid.Please enter valid number");
                scan.next();
            }
            row=scan.nextInt();
        }while(row<=0);
        char ch='A';
        for(int i=0;i<row;i++)//loop for printing rows
        {
            for(int j=0;j<=i;j++)//first half loop
            {
                System.out.print((char)(ch+j));
            }
        
            
            for(int j=i-1;j>=0;j--)//second half loop
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        
        }
        scan.close();
    }
    
}
