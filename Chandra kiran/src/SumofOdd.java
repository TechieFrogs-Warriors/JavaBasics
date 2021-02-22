import java.util.Scanner;

public class SumofOdd 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size,num;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            num=scan.nextInt();
            size=scan.nextInt();
    
        }while(size<=0&&num<=0);
        int sum=0;
        for(int i=num;i<=size;i++)
        {
             if(i%2==1)//checks the odd number
            {
                sum=sum+i;//add all the odd numbers
            }
        }
        System.out.println("Sum of Odd numbers between 100 and 1000 "+sum);
        scan.close();
        
    }
    
}
