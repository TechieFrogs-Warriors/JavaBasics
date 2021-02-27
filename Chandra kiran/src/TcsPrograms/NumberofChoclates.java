package TcsPrograms;

import java.util.Scanner;

public class NumberofChoclates 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num=InputValidation(scanner);
        int N=10;
        

        if(num>N)
        {
            System.out.println("Invalid Input");//if the input is greater than candies present prints invalid
        }
        else
        {
            System.out.println("Number of Candies sold "+num);//candies which are sold
            N=N-num;//gives the remaining candies value
            System.out.println("Number of candies Available "+N);
            if(N<=5)//checks the remaining choclates are less than 5
            {

                for(int i=0;i<=5;i++)
                {
                    if(N==i)
                    {
                        N=N+(10-i);//Jar will be refilled if value is less than 5
                        System.out.println(N);
                    }
                    

                }
            }
        }
        

        
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
