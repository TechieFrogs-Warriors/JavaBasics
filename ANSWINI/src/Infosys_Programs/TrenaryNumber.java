package Infosys_Programs;
//program to find trenary number to decimal number 

import java.util.Scanner;

import TCS_Programs.Validation;

public class TrenaryNumber 
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

    //Method implementing logic
    public static String tor(int n,String c)
    {
        //converting string to integer value
        int number =Integer.parseInt(c);
        int temp=number;//placed into temporary variable
        int remainder = 0 ; //required variable for logic
        String s =""; //required variable for logic
            
        //Logic
        while(temp != 0)
        {
            remainder = temp % 3 ; //getting remainder
            s = s.concat(Integer.toString(remainder)); //converting from integer and placing remainder in string
            temp = temp/3 ; //getting quotient

        }

        //reversing the achived string of digits
        
        /*StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        s = sb.toString(); */
        String s1="",s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            s1 = s1 + ch;
        }

        //Extracting the required digits based on length given in input
        for(int i=s1.length()-n;i<=s1.length()-1;i++)
        {
            char ch = s1.charAt(i);
            s2 = s2 + ch;
        }
        
        return s2; //returning output
    }

    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);

        //Reading how much length integer you want 
        System.out.println("Enter length of your number");
        int n = Validation.integerValidation(sc);

        //Reading string input
        System.out.println("Enter string");
        String c = stringValidation(sc);//from validation method in this class

        //calling method that performs logic
        
        System.out.println(tor(n,c));

        
    }
    

}
