import java.util.Scanner;

public class FactorialNum 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            size=scan.nextInt();
    
        }while(size<=0);
        int fact=1;
        for(int i=0;i<size;i++)
        {
            fact=fact*(size-i);//gives factorial of given number
        }
        System.out.println("Factorial of Number "+fact);//prints the factorial of number
        scan.close();
        
    }
    
}
