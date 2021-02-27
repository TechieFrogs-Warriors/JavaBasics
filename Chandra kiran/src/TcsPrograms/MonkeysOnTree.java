package TcsPrograms;

import java.util.Scanner;

public class MonkeysOnTree 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n=InputValidation(scanner);
        int k=InputValidation(scanner);
        int j=InputValidation(scanner);
        int m=InputValidation(scanner);
        int p=InputValidation(scanner);
        int RemainingMonkeys=0,MonkeyseatBananas=0,MonkeyseatPeanuts=0;
        if(k>0&&j>0)
        {
            MonkeyseatBananas=m/k;//no.of.monkeys eat bananas
            MonkeyseatPeanuts=p/j;//no.of.monkeys eat peanuts
            
        }
        RemainingMonkeys=n-MonkeyseatBananas-MonkeyseatPeanuts;//gives remaining monkeys
        System.out.println("Number of Monkeys left on the tree:"+RemainingMonkeys);
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
