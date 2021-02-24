package TcsPrograms;

import java.util.Scanner;

public class Series235 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       int number=InputValidation(scanner);
       int nterm=0;
       while(number>0)//checks the number greater than zero
       {
           nterm++;//increaments the nterm value
           if(nterm==1)
           {
               number--;//decreaments the number value
           }
           if(nterm%2==0||nterm%3==0||nterm%5==0)//checks if nthterm value is divided by 2,3,5
           {
               number--;//decreaments the number value

           }
        }
        System.out.println("the nth term of series "+nterm);//prints the nth term value
       
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
