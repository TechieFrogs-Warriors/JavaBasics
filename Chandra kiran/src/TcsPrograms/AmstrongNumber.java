package TcsPrograms;

import java.util.Scanner;



public class AmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N1=InputValidation(scanner);
        int N2=InputValidation(scanner);
        int temp=0,remainder=0,i;
        if((N1<=0||N2<=0)||(N1>=N2))
        {
            System.out.println("Wrong Input");
        }
        else
        {
            for( i=N1;i<N2;i++)
            {
                temp=i;
               int  sum=0;
                while(temp!=0)
                {
                    remainder=temp%10;//gives last digit of number
                    sum=sum+remainder*remainder*remainder;//adds the cube of last digit
                    temp=temp/10;//first two digits will be stored in temp 
                }
                if(i==sum)//checks the sum is equal to number 
               { 
                   System.out.println("The Amstrong Number which is in given range "+i);
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
