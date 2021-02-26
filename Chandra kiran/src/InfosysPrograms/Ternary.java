package InfosysPrograms;

import java.util.Scanner;

public class Ternary 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("length of the number");
        int n=InputValidation(scanner);
        String c=Validation(scanner);
         String resultString =TOR(n, c);//method calling
         System.out.println(resultString);
    }
    public static String TOR(int n,String c)
    {
        int number =Integer.parseInt(c);//coverting string to integer
        int temp=number;
        int remainder=0;
        String s="";
        while(temp!=0)//checks the value of temp 
        {
            remainder=temp%3;//gives the remainder of number
            s=s.concat(Integer.toString(remainder));//remainder is coverted to string and concatinated to the string
            temp=temp/3;//gives the quotient value of number
        }
        String s1="",s2="";
        for(int i=s.length()-1;i>=0;i--)//for loop to print reverse of string
        {
            char ch=s.charAt(i);
            s1=s1+ch;//concatenates the reversed string
        }
        for(int i=s1.length()-n;i<=s1.length()-1;i++)//for loop to print the result string
        {
            char ch=s1.charAt(i);
            s2=s2+ch;

        }
        return s2;//returns the string
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
