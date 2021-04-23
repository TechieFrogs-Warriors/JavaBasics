import java.util.Scanner;
public class PatternAssesment 
{
    public static void main(String[] args) 
    {
        //taking user input
        Scanner sc=new Scanner(System.in);
        int n;
        //validation of input
        do
        {   
            System.out.println("please enter positive number of rows");
            while(!sc.hasNextInt())
            {
               System.out.println("enter a positive number"); 
               sc.next();
            }
            n=sc.nextInt();

        }while(n<=0);
        System.out.println("your number of rows are: "+n);

        //program logic
        for(int i=1;i<=n;i++)//outer loop for rows
        {
            for(int j=n;j>=i;j--)//printing loop
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    
}
