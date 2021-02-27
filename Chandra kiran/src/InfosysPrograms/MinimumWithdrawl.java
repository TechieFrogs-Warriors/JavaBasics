package InfosysPrograms;

import java.util.Scanner;

public class MinimumWithdrawl 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=InputValidation(scanner);
        int ATM[]= new int[N];
        for(int i=0;i<ATM.length;i++)
        {
            ATM[i]=InputValidation(scanner);
        }
        int X=InputValidation(scanner);
        int withdraw=minimumWithdrawal(ATM,N,X);//method calling
        if(withdraw==-1)//checks the withdraw value
        {
            System.out.println("Sarah cannot withdraw "+withdraw);
        }
        else
        {
            System.out.println("Minimum number of withdraws are: "+withdraw);
        }
        scanner.close();
        
    }
    public static int minimumWithdrawal(int ATM[],int N,int X)
    {
        int min=0,sum=0;

            for(int i=0;i<ATM.length;i++)
            {
                sum=sum+ATM[i];//adds the amount in atm
                min++;//increaments the min
                if(sum>=X)//checks if sum greater than or equal to withdraw
                {
                    break;
                }
                
            }
            if(X>sum)//checks the withdrawal amount
            {
                min=-1;//min value will be -1

            }
        
        return min;
        
    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
    
}
