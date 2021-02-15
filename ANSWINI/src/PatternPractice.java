import java.util.Scanner;


public class PatternPractice 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int n;
        do
        {
            System.out.println("Enter positive row size");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter only Integer number");
                sc.next();
            }
            n=sc.nextInt();

        }while(n<=0);
        System.out.println("Its a valid number"+n);

        for(int i=n;i>=-n;i--)//outer loop
        {
            for(int k=1;k<=Math.abs(i);k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=Math.abs(i);j--)//inner loop
            {
                System.out.print("* ");//what to print
            }
            System.out.println();//nextline printing
        }
       sc.close();

    }
    
}
