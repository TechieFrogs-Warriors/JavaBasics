package InfosysPrograms;

import java.util.Scanner;

public class MinimumPluses 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String A=Validation(scanner);
        int Pluses= minimum_pluses(A);
        System.out.println("Minimum number of Pluses "+Pluses);
        scanner.close();

    }
    public static int minimum_pluses(String A)
    {
        int count=0,rem=0,sum=0;
        String stringArray[]=A.split("=");
        String firstPosition=stringArray[0];//takes the first element of array
        String lastPostion=stringArray[stringArray.length-1];//last postion of array
        int number=Integer.parseInt(firstPosition);//coverts string into int
        int number1=Integer.parseInt(lastPostion);
        while(number>0)//checks the number greater than zero
        {
            rem=number%10;//assign last digit
            sum=sum+(rem);//adds to sum
            count++;//count will be increamented
            number=number/10;//first digits will be stored
            if(number1==(sum+number))
            {
                System.out.println(count);
                break;
                
            } 
                
        }
            
            return count;
    
    }
    public static String Validation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[0-9=]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    
}
