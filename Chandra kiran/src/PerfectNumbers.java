import java.util.Scanner;

public class PerfectNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n,m;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            n=scan.nextInt();
            m=scan.nextInt();
        }while(n<=0&&m<=0);
        int count=0;
        for(int i=n;i<m;i++)//for loop for numbers
        {
            int sum=0;
            for(int j=i/2;j>0;j--)//for loop for factors 
            if(i%j==0)//divides the number with all numbers
            {
              sum=sum+j;             
                    
            }
            if(sum==i)//checks whether the sum is equal to the number
            {
              count=count+1;//count will be increament when number equals to sum of factors
                    
            }
            
            
        }
        System.out.println("Count of Perfect Numbers between 5000 and 9000 "+count);
        scan.close();
    }
    
}
