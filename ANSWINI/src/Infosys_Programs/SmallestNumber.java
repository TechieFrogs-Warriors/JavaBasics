package Infosys_Programs;
//program to find smallest number by deleting digits from given input number using k value 

import java.util.Scanner;

import TCS_Programs.Validation;

public class SmallestNumber 
{
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            //System.out.println("Enter string ");
            while(!sc.hasNext("[0-9]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Taking Number as string input
        System.out.println("Enter your string of digits");
        String originalText = stringValidation(sc);

        //converting string to integer value
        int originalNumber = Integer.parseInt(originalText);

        //to delete k digits from the input number
        int k = Validation.integerValidation(sc);

        //calling method that finds the smallest number after deleting k digits from it
        int newNum = smallestNum(originalNumber,k);

        //printing the output
        System.out.println(newNum);

        sc.close();
        
    }

    //Method that performs logic and returns smallest integer
    public static int smallestNum(int originalNumber,int k)
    {
        //loop to remove k digits from the given number
        for(int i=0;i<k;i++)
        {
            originalNumber = originalNumber/10;
            
        }

        //System.out.println("original: "+originalNumber);

        //doing modulo division
        originalNumber =  (originalNumber % (int)(Math.pow(10, 9) + 7));

        //return final integer value
        return originalNumber;

    }
    
}
