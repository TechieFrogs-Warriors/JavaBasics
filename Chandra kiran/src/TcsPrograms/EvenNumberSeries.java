package TcsPrograms;

import java.util.Scanner;

public class EvenNumberSeries 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int term=InputValidation(scanner);
        int Series[]= new int[term];
        for(int i=0;i<Series.length;i++)//for loop for array elements
        {
            if(i%2==0)
            {
                Series[i]=2*(i/2);//gives the multiples of 2
                System.out.print(Series[i]+" ");

            }
            else
            {
                Series[i]=(i/2);//gives the numbers
                System.out.print(Series[i]+" ");
            }
            if(i==Series.length-1)//prints the last term of the array
            {
                System.out.println(Series[i]);
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
