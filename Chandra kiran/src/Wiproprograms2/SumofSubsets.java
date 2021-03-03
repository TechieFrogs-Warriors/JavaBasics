package Wiproprograms2;

import java.util.Scanner;

public class SumofSubsets 
{
   public static void main(String[] args) 
   {
       Scanner scanner = new Scanner(System.in);
       String S=InputValidation(scanner);
       sumOfSubStrings(S);
    } 
   public static void sumOfSubStrings(String S)
   {
       
       int sum=0;
       for(int i=0;i<S.length();i++)
       {
           for(int j=i+1;j<=S.length();j++)
           {
               sum=sum+Integer.parseInt(S.substring(i, j));//finding the subsets and coverting them into integer and adding to sum 
           }
        }
        System.out.println(sum);//printing the sum
    }
   public static String InputValidation(Scanner scan)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext("[0-9]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
}
