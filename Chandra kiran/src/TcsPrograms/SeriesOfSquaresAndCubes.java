package TcsPrograms;

import java.util.Scanner;

public class SeriesOfSquaresAndCubes 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int term=InputValidation(scanner);
        int Series[]=new int[term];
        for(int i=0;i<Series.length;i++)
        {
            if(i%2==0)
            {
                int j=i/2;
            
                Series[i]=(int)Math.pow(2, j);//gives the powers of 2
                System.out.print(Series[i]+" ");
                
            }
            else
            {
                int j=i/2;//takes the half value of i
                Series[i]=(int)Math.pow(3, j);//gives the powers of 3
                System.out.print(Series[i]+" ");
                
            }
            if(i==Series.length-1)
            {
                System.out.println(Series[i]+" ");//prints the last element

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
