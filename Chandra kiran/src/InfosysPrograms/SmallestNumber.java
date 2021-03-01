package InfosysPrograms;

import java.util.Scanner;

public class SmallestNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String Num=Validation(scanner);
        int K=InputValidation(scanner);
        int small=smallestNumber(Num,K);//method calling
        System.out.println("The smallest number is "+small);
        scanner.close();
    }
    public static int smallestNumber(String Num,int k)//method for finding smallest number
    {
        
        int Number=Integer.parseInt(Num);//converting string to int
        for(int i=0;i<k;i++)//for loop for removing the k digits
        { 
            Number=Number/10;
        }
        Number=Number%((int)Math.pow(10, 9)+7);//moduloo division of number by 10^9+7
        return Number;
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
    
    public static String Validation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[0-9]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    

    
}
